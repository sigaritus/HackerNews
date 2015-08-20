package com.sigaritus.swu.hackerNews.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sigaritus.swu.hackerNews.R;
import com.sigaritus.swu.hackerNews.entity.Story;

import java.util.List;

/**
 * Created by Administrator on 2015/8/19.
 */
public class TopStroyListAdapter extends RecyclerView.Adapter<TopStroyListAdapter.mViewHolder>{

    private Context mcontext;

    private List<Story> datas;

    public TopStroyListAdapter(Context mcontext, List<Story> datas) {
        this.mcontext = mcontext;
        this.datas = datas;
    }

    public List getDatas() {
        return datas;
    }

    public void setDatas(List datas) {
        this.datas = datas;
    }

    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mViewHolder view = new mViewHolder(LayoutInflater.from(mcontext).inflate(

                R.layout.story_list_item, parent, false

        ));

        return view;
    }

    @Override
    public void onBindViewHolder(mViewHolder holder, int position) {

//        mViewHolder
        holder.title.setText(datas.get(position).getTitle());
        holder.author.setText(datas.get(position).getBy());


    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    static class mViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView author;
        ImageView icon;
        public mViewHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.story_title);
            author = (TextView)itemView.findViewById(R.id.author);
            icon = (ImageView)itemView.findViewById(R.id.author_icon);
        }
    }

}
