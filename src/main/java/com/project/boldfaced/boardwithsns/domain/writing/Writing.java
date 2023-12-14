package com.project.boldfaced.boardwithsns.domain.writing;

import com.project.boldfaced.boardwithsns.domain.BaseEntity;
import com.project.boldfaced.boardwithsns.domain.member.Member;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DiscriminatorColumn(name = "DTYPE")
@AttributeOverride(name = "id", column = @Column(name = "WRITING_ID"))
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public abstract class Writing extends BaseEntity {

    private String content;

    private boolean activated;

    public Writing(String content, boolean activated, Member member, Writing parentWriting) {
        this.content = content;
        this.activated = activated;
        this.member = member;
        this.parentWriting = parentWriting;
    }

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "PARENT_WRITING_ID")
    private Writing parentWriting;

    public void updateActivation(boolean activated) {
        this.activated = activated;
    }

    public void updateContent(String content) {
        this.content = content;
    }
}
