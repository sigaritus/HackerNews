package com.sigaritus.swu.hackerNews.view.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sigaritus.swu.hackerNews.view.fragment.NewStoryFragment;
import com.sigaritus.swu.hackerNews.view.fragment.TopStoryFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/8/16.
 */
public class NewAndTopFragmentAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragments = new ArrayList<>();
    private final List<String> mFragmentTitles = new ArrayList<>();

    public NewAndTopFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String title) {
        mFragments.add(fragment);
        mFragmentTitles.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0) {
            Fragment fragment = new TopStoryFragment();
            Bundle args = new Bundle();


            fragment.setArguments(args);
            return fragment;
        }else if (position==1){
            Fragment fragment = new NewStoryFragment();
            Bundle args = new Bundle();

            fragment.setArguments(args);
            return fragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitles.get(position);
    }
}
