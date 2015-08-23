package com.sigaritus.swu.hackerNews.network;

import android.util.Log;
import android.widget.Toast;

import com.sigaritus.swu.hackerNews.HNAppliaction;
import com.sigaritus.swu.hackerNews.entity.ID;
import com.sigaritus.swu.hackerNews.entity.Story;
import com.sigaritus.swu.hackerNews.serviceAdapter.StoriesIDRESTAdapter;
import com.sigaritus.swu.hackerNews.serviceAdapter.StoryRESTAdapter;
import com.sigaritus.swu.hackerNews.utils.Ins2Str;
import com.squareup.okhttp.Call;

import org.litepal.crud.DataSupport;

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

        Callback<Response> callback = new Callback<Response>() {
            @Override
            public void success(Response response, Response response2) {

                try {
                    TypedInput body =response.getBody();
                    List<String> list ;


                    list=Ins2Str.Inputstr2Str_list(body.in(),
                            new ArrayList<String>(), "utf-8");

                    if (DataSupport.count(ID.class)>=1000) {
                        DataSupport.deleteAll(ID.class);
                    }

                    for (int i =0 ;i< list.size();i++){
                        ID id =  new ID(i,list.get(i));
                        id.save();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(HNAppliaction.getContext(),"error",Toast.LENGTH_SHORT).show();
            }
        };

        StoriesIDRESTAdapter.getStoriesID("pretty", callback);
    }

    public static void getStoryList(List<ID> idList){

        Callback<Story> callback = new Callback<Story>() {
            @Override
            public void success(Story story, Response response) {

                Log.i("---story",story.toString());
                story.save();

            }

            @Override
            public void failure(RetrofitError error) {

                Toast.makeText(HNAppliaction.getContext(),"storylist error",Toast.LENGTH_SHORT).show();

            }
        };

//            DataSupport.deleteAll(Story.class);

        for (int i = 0; i < idList.size()/10; i++) {
            StoryRESTAdapter.storiesInfo(idList.get(i).getSid(),callback);
        }

    }

}
