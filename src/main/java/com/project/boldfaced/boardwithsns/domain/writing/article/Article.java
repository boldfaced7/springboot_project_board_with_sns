package com.project.boldfaced.boardwithsns.domain.writing.article;

import com.project.boldfaced.boardwithsns.domain.member.Member;
import com.project.boldfaced.boardwithsns.domain.writing.Writing;
import com.project.boldfaced.boardwithsns.domain.writing.comment.Comment;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@DiscriminatorValue("Article")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Article extends Writing {

    private String title;

    private int count;

    public Article(String content, boolean activated, Member member, Writing parentWriting, String title) {
        super(content, activated, member, parentWriting);
        this.title = title;
    }

    public void updateTitle(String title) {
        this.title = title;
    }

    public void addCount() {
        count++;
    }
}
