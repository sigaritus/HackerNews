package com.sigaritus.swu.hackerNews.entity;

import org.litepal.crud.DataSupport;

import java.util.Arrays;

/**
 * Created by Administrator on 2015/8/5.
 *
 */
public class Story extends DataSupport{

    private String by;
    //author
    private int descendants;
    //total comment count
    private int id;
    //
    private int[] kids;
    //comments ids
    private int score;
    //the story's score
    private int time;
    //unix time stamp
    private String title;
    //article's title
    private String type;
    //
    private String url;
    //article's url


    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public int getDescendants() {
        return descendants;
    }

    public void setDescendants(int descendants) {
        this.descendants = descendants;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getKids() {
        return kids;
    }

    public void setKids(int[] kids) {
        this.kids = kids;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Story{" +
                "by='" + by + '\'' +
                ", descendants=" + descendants +
                ", id=" + id +
                ", kids=" + Arrays.toString(kids) +
                ", score=" + score +
                ", time=" + time +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
