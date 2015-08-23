package com.sigaritus.swu.hackerNews.dao;

import com.sigaritus.swu.hackerNews.entity.Story;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by Administrator on 2015/8/23.
 */
public class StoryDao {

    public static List<Story> getStoryData(){

        return DataSupport.findAll(Story.class);

    }

}
