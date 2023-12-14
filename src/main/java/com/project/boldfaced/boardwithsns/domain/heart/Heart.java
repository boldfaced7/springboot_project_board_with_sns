package com.project.boldfaced.boardwithsns.domain.heart;

import com.project.boldfaced.boardwithsns.domain.BaseEntity;
import com.project.boldfaced.boardwithsns.domain.member.Member;
import com.project.boldfaced.boardwithsns.domain.writing.Writing;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AttributeOverride(name = "id", column = @Column(name = "HEART_ID"))
@Entity
public class Heart extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "WRITING_ID")
    private Writing writing;
}
