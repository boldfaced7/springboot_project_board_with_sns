package com.project.boldfaced.boardwithsns.domain.following;

import com.project.boldfaced.boardwithsns.domain.BaseEntity;
import com.project.boldfaced.boardwithsns.domain.member.Member;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AttributeOverride(name = "id", column = @Column(name = "FOLLOWING_ID"))
@Entity
public class Following extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "TARGET_ID")
    private Member target;

    @Builder
    public Following(Member member, Member target) {
        this.member = member;
        this.target = target;
    }
}
