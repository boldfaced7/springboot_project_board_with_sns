package com.project.boldfaced.boardwithsns.domain.following;

import com.project.boldfaced.boardwithsns.domain.BaseEntity;
import com.project.boldfaced.boardwithsns.domain.member.Member;
import com.project.boldfaced.boardwithsns.domain.writing.Writing;
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
    @JoinColumn(name = "WRITING_ID")
    private Writing writing;

    @Builder
    public Following(Member member, Writing writing) {
        this.member = member;
        this.writing = writing;
    }
}
