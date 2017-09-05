package com.lvpeiling.belibeli.entity;

/**
 * Created by lpl72 on 2017/6/20.
 */

public class Stats {
    private int followers;
    private int following;
    private int views;
    private int appreciations;
    private int comments;

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getAppreciations() {
        return appreciations;
    }

    public void setAppreciations(int appreciations) {
        this.appreciations = appreciations;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }
}
