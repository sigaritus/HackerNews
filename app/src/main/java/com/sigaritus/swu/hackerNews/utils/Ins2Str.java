package com.sigaritus.swu.hackerNews.utils;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2015/8/19.
 */
public class Ins2Str {
    public static List Inputstr2Str_list(InputStream in,List<String> list, String encode)
    {

        String str="";
        try
        {
            if (encode == null || encode.equals(""))
            {
                // 默认以utf-8形式
                encode = "utf-8";
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, encode));

            str = reader.readLine();

            list = Arrays.asList(str.substring(1, str.length() - 1).split(","));

            Log.i("list--",list.size()+"---");

            return list;
        }
        catch (UnsupportedEncodingException e1)
        {
            e1.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return list;
    }
}
