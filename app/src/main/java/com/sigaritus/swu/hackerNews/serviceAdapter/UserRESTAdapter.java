package com.sigaritus.swu.hackerNews.serviceAdapter;

import com.sigaritus.swu.hackerNews.constants.Constants;
import com.sigaritus.swu.hackerNews.entity.User;
import com.sigaritus.swu.hackerNews.service.HackerService;
import com.squareup.okhttp.OkHttpClient;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Administrator on 2015/7/30.
 */
public class UserRESTAdapter {
    public static void getUser(Callback<User> callback){

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Constants.API_URL)
                .setClient(new OkClient(new OkHttpClient()))
                .build();

        HackerService v2EXService = restAdapter.create(HackerService.class);

//        githubService.listContributors("square","retrofit",callback);

        v2EXService.getUser("sigaritus",callback);
    }
}
