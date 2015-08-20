package com.sigaritus.swu.hackerNews.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.sigaritus.swu.hackerNews.R;
import com.sigaritus.swu.hackerNews.entity.Story;
import com.sigaritus.swu.hackerNews.entity.XIDs;
import com.sigaritus.swu.hackerNews.service.StoriesIDService;
import com.sigaritus.swu.hackerNews.serviceAdapter.StoriesIDRESTAdapter;
import com.sigaritus.swu.hackerNews.serviceAdapter.StoryRESTAdapter;
import com.sigaritus.swu.hackerNews.utils.Ins2Str;
import com.sigaritus.swu.hackerNews.view.adapter.TopStroyListAdapter;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedInput;

/**
 * Created by Administrator on 2015/8/16.
 */
public class TopStoryFragment extends Fragment {



    RecyclerView storyLv;
    List<Story> storyList;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.top_fragmnet_layout, container, false);

        storyLv =(RecyclerView)rootView.findViewById(R.id.top_stories_list);

        storyLv.setLayoutManager(new LinearLayoutManager(getActivity()));

        storyList = new ArrayList<Story>();


//        StoriesIDRESTAdapter.getStoriesID("pretty",callback);

        Log.i("--list",""+storyList.size());



        return rootView;
    }
}
