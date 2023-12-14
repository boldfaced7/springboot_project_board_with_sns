package com.project.boldfaced.boardwithsns.domain.member;

import com.project.boldfaced.boardwithsns.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AttributeOverride(name = "id", column = @Column(name = "MEMBER_ID"))
@Entity
public class Member extends BaseEntity {

    private String username;

    private String nickname;

    private String password;

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column
    private boolean activated;

    private String profileImageUrl;

    @Builder
    public Member(String username, String nickname, String password,
                  String email, Role role, boolean activated, String profileImageUrl) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.role = role;
        this.activated = activated;
        this.profileImageUrl = profileImageUrl;
    }

    public void updateNickname(String nickname) {
        this.nickname = nickname;
    }

    public void updatePassword(String password) {
        this.password = password;
    }

    public void updateProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public void updateActivation(boolean activated) {
        this.activated = activated;
    }

    public boolean isActivated() {
        return activated;
    }

}
