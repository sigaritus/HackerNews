package com.sigaritus.swu.hackerNews.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/8/19.
 */
public class XIDs {
    private List<String> idList = new ArrayList<>();

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public List<String> getIdList() {
        return idList;
    }

    public void addid(String id){

        idList.add(id);

    }

    @Override
    public String toString() {
        return "XIDs{" +
                "idList=" + idList +
                '}';
    }
}
