package com.sigaritus.swu.hackerNews.entity;

/**
 * Created by Administrator on 2015/8/5.
 */
public class Story {

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


}
