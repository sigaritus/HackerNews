package com.sigaritus.swu.hackerNews.service;

import com.sigaritus.swu.hackerNews.entity.Story;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Administrator on 2015/8/7.
 */
public interface StoriesService {
    @GET("/item/{id}")
    void StoriesInfo(@Path("id") String id, Callback<Story> Storycallback);
}
