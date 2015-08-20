package com.sigaritus.swu.hackerNews.service;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Administrator on 2015/8/19.
 */
public interface StoriesIDService {
    @GET("/topstories.json")
    public void getTopStoriesID(@Query("print")String print,Callback<Response> callback);

}
