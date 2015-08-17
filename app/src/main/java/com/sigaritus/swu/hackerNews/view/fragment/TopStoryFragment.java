package com.sigaritus.swu.hackerNews.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sigaritus.swu.hackerNews.R;
import com.sigaritus.swu.hackerNews.entity.Story;
import com.sigaritus.swu.hackerNews.serviceAdapter.StoryRESTAdapter;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Administrator on 2015/8/16.
 */
public class TopStoryFragment extends Fragment {

    Callback<Story> callback = new Callback<Story>() {
        @Override
        public void success(Story story, Response response) {

        }

        @Override
        public void failure(RetrofitError error) {
            Log.i("fail-------", error.toString());
        }
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.top_fragmnet_layout, container, false);
        Bundle args = getArguments();
        ((TextView) rootView.findViewById(R.id.top_text)).setText(
                "hello");


        StoryRESTAdapter.storiesInfo("10007254.json", callback);
        return rootView;
    }
}
