package com.sigaritus.swu.hackerNews.serviceAdapter;

import com.sigaritus.swu.hackerNews.constants.Constants;
import com.sigaritus.swu.hackerNews.entity.Story;
import com.sigaritus.swu.hackerNews.service.StoriesService;
import com.squareup.okhttp.OkHttpClient;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Administrator on 2015/8/7.
 */
public class StoryRESTAdapter {
    public static void storiesInfo(String id,Callback<Story> storyCallback){
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Constants.API_URL)
                .setClient(new OkClient(new OkHttpClient()))
                .build();
        StoriesService storiesService = restAdapter.create(StoriesService.class);
        storiesService.StoriesInfo(id,storyCallback);
    }

}
