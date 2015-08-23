package com.sigaritus.swu.hackerNews.dao;

import com.sigaritus.swu.hackerNews.entity.ID;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/8/22.
 */
public class IDdao {

    public static List<ID> getID(){

        List<ID> idlist = new ArrayList<ID>();

        idlist = DataSupport.findAll(ID.class);

        return idlist;
    }

}
