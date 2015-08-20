package com.sigaritus.swu.hackerNews.serviceAdapter;

import com.sigaritus.swu.hackerNews.constants.Constants;
import com.sigaritus.swu.hackerNews.service.StoriesIDService;
import com.sigaritus.swu.hackerNews.service.StoriesService;
import com.squareup.okhttp.OkHttpClient;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.client.Response;

/**
 * Created by Administrator on 2015/8/19.
 */
public class StoriesIDRESTAdapter {
    public static void getStoriesID(String print,Callback<Response> callback){

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Constants.API_URL)
                .setClient(new OkClient(new OkHttpClient()))
                .build();
        StoriesIDService storiesidService = restAdapter.create(StoriesIDService.class);

        storiesidService.getTopStoriesID(print,callback);

    }
}
