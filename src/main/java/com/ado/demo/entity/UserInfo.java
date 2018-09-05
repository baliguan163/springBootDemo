package com.ado.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private Integer userinfoId;

    private Integer userId;

    private String userName;

    private Boolean userSex;

    private Date userBirthday;

    private String userJob;

    private String userPost;

    private Integer userPlace;

    private String userImage;

    private Date userRecentLoginTime;

    private Integer userPv;

    private String userIntroduction;

    private static final long serialVersionUID = 1L;

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Boolean getUserSex() {
        return userSex;
    }

    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob == null ? null : userJob.trim();
    }

    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost == null ? null : userPost.trim();
    }

    public Integer getUserPlace() {
        return userPlace;
    }

    public void setUserPlace(Integer userPlace) {
        this.userPlace = userPlace;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }

    public Date getUserRecentLoginTime() {
        return userRecentLoginTime;
    }

    public void setUserRecentLoginTime(Date userRecentLoginTime) {
        this.userRecentLoginTime = userRecentLoginTime;
    }

    public Integer getUserPv() {
        return userPv;
    }

    public void setUserPv(Integer userPv) {
        this.userPv = userPv;
    }

    public String getUserIntroduction() {
        return userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction == null ? null : userIntroduction.trim();
    }
}