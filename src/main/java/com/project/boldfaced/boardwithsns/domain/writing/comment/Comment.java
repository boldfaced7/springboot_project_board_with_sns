package com.project.boldfaced.boardwithsns.domain.writing.comment;

import com.project.boldfaced.boardwithsns.domain.member.Member;
import com.project.boldfaced.boardwithsns.domain.writing.Writing;
import com.project.boldfaced.boardwithsns.domain.writing.article.Article;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@DiscriminatorValue("Comment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Comment extends Writing {

    @ManyToOne
    @JoinColumn(name = "ARTICLE_ID")
    private Article article;

    public Comment(String content, boolean activated, Member member, Writing parentWriting, Article article) {
        super(content, activated, member, parentWriting);
        this.article = article;
    }
}
