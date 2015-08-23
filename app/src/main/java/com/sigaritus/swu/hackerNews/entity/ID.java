package com.sigaritus.swu.hackerNews.entity;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2015/8/22.
 */
public class ID extends DataSupport{
    private  int id;
    private  String sid;

    public ID(int id, String sid) {
        this.id = id;
        this.sid = sid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
