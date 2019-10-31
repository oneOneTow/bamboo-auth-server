package com.luzhiqing.bamboo.wx.mp;

import com.luzhiqing.common.token.UserInfo;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/26 17:05
 */
public class MpUser implements UserInfo {
    private int uid;
    private String nickname;
    private Boolean admin;

    public MpUser(int uid, String nickname, Boolean admin) {
        this.uid = uid;
        this.nickname = nickname;
        this.admin = admin;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @Override
    public Boolean getAdmin() {
        return null;
    }

    @Override
    public String getNickname() {
        return null;
    }

    @Override
    public int getUid() {
        return 0;
    }
}
