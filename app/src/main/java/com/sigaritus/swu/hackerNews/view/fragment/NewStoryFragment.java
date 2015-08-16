package com.sigaritus.swu.hackerNews.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sigaritus.swu.hackerNews.R;

/**
 * Created by Administrator on 2015/8/16.
 */
public class NewStoryFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.top_fragmnet_layout, container, false);
        Bundle args = getArguments();
        ((TextView) rootView.findViewById(R.id.top_text)).setText(
                "goodbye");
        return rootView;
    }
}
