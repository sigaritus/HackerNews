package com.sigaritus.swu.hackerNews.network;

import android.util.Log;
import android.widget.Toast;

import com.sigaritus.swu.hackerNews.entity.Story;
import com.sigaritus.swu.hackerNews.entity.XIDs;
import com.sigaritus.swu.hackerNews.serviceAdapter.StoriesIDRESTAdapter;
import com.sigaritus.swu.hackerNews.serviceAdapter.StoryRESTAdapter;
import com.sigaritus.swu.hackerNews.utils.Ins2Str;
import com.squareup.okhttp.Call;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedInput;

/**
 * Created by Administrator on 2015/8/20.
 */
public class DataEngine {

    /*
    *把topstories 的id存在本地数据库中
     */
    public static void getTopStoryIDList(){

        List<String> list;

        Callback<Response> callback = new Callback<Response>() {
            @Override
            public void success(Response response, Response response2) {

                try {
                    TypedInput body =response.getBody();
                    List<String> list = new ArrayList<String>();

                    Log.i("body", body.mimeType() + "---" + body.length());

                    list=Ins2Str.Inputstr2Str_list(body.in(),
                            new ArrayList<String>(), "utf-8");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void failure(RetrofitError error) {

            }
        };

        StoriesIDRESTAdapter.getStoriesID("pretty", callback);
    }

}
