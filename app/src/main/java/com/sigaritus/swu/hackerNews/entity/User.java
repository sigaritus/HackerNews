package com.sigaritus.swu.hackerNews.entity;

/**
 * Created by Administrator on 2015/7/31.
 */
public class User {


    private int id;
    //用户ID
    private String url;
    //用户主页
    private String username;
    //用户名
    private String website;
    //网站链接
    private String twitter;
    //推特
    private String psn;
    //psn链接
    private String github;
    //github链接
    private String btc;
    //比特币
    private String location;
    //地理位置
    private String tagline;
    //
    private String bio;
    //简介
    private String avatar_mini;
    //头像
    private String avatar_normal;
    private String avatar_large;
    private String created;
    //创建日期

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getPsn() {
        return psn;
    }

    public void setPsn(String psn) {
        this.psn = psn;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getBtc() {
        return btc;
    }

    public void setBtc(String btc) {
        this.btc = btc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAvatar_mini() {
        return avatar_mini;
    }

    public void setAvatar_mini(String avatar_mini) {
        this.avatar_mini = avatar_mini;
    }

    public String getAvatar_normal() {
        return avatar_normal;
    }

    public void setAvatar_normal(String avatar_normal) {
        this.avatar_normal = avatar_normal;
    }

    public String getAvatar_large() {
        return avatar_large;
    }

    public void setAvatar_large(String avatar_large) {
        this.avatar_large = avatar_large;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", website='" + website + '\'' +
                ", twitter='" + twitter + '\'' +
                ", psn='" + psn + '\'' +
                ", github='" + github + '\'' +
                ", btc='" + btc + '\'' +
                ", location='" + location + '\'' +
                ", tagline='" + tagline + '\'' +
                ", bio='" + bio + '\'' +
                ", avatar_mini='" + avatar_mini + '\'' +
                ", avatar_normal='" + avatar_normal + '\'' +
                ", avatar_large='" + avatar_large + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}
