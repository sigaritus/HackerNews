package com.sigaritus.swu.hackerNews.service;

import com.sigaritus.swu.hackerNews.entity.User;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Administrator on 2015/7/30.
 */
public interface HackerService {
//    @GET("/users/{user}/repos")
//    List<Repo> listRepos(@Path("user") String user);
//
//    @GET("/repos/{owner}/{repo}/contributors")
//    List<Contributor> listContributors(@Path("owner") String owner,@Path("repo") String repo);
//
//    @GET("/repos/{owner}/{repo}/contributors")
//    void listContributors(@Path("owner") String owner,@Path("repo") String repo, Callback<List<Contributor>> callback );

    //https://hacker-news.firebaseio.com/v0/item/8863.json?print=pretty
    @GET("/members/show.json")
    void getUser(@Query("username") String username ,Callback<User> callback);


    //https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty

    @GET("/topstories.json")
    void topStories();


    /*
    *
    *  https://hacker-news.firebaseio.com/v0/maxitem.json
    *
    *  https://hacker-news.firebaseio.com/v0/topstories.json
    *
    *  https://hacker-news.firebaseio.com/v0/newstories.json
    *
    * --------------------------------------------------------
    *
    *  https://hacker-news.firebaseio.com/v0/askstories.json
    *
    *  https://hacker-news.firebaseio.com/v0/showtories.json
    *
    *  https://hacker-news.firebaseio.com/v0/jobtories.json
    *
    *  ------------------------------------
    *
    *   https://hacker-news.firebaseio.com/v0/item/{id}
    *
    *
    *
    *
    *
     */


}
