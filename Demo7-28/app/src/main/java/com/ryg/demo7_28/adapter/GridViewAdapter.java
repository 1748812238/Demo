package com.ryg.demo7_28.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ryg.demo7_28.Bean.Bean;
import com.ryg.demo7_28.R;

import java.util.List;

/**
 * Created by apple on 17/8/3.
 *
 */

public class GridViewAdapter extends BaseAdapter {
    private List<Bean> mDatas;
    private LayoutInflater inflater;
    private int pageSize;
    private int curIndex;

    public GridViewAdapter(List<Bean> mDatas, Context inflater, int pageSize, int curIndex){
        this.mDatas = mDatas;
        this.inflater = LayoutInflater.from(inflater);
        this.pageSize = pageSize;
        this.curIndex = curIndex;

    }

    @Override
    public int getCount() {
        return mDatas.size() > (curIndex + 1) * pageSize ? pageSize : (mDatas.size() - curIndex * pageSize);
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position + curIndex * pageSize);
    }

    @Override
    public long getItemId(int position) {
        return position + curIndex * pageSize;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewholder = null;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.gridview_item,parent,false);
            viewholder = new ViewHolder();
            viewholder.tv = (TextView) convertView.findViewById(R.id.gridview_title);
            viewholder.iv = (ImageView) convertView.findViewById(R.id.gridview_image);
            convertView.setTag(viewholder);
        }else{
            viewholder = (ViewHolder) convertView.getTag();
        }

        int pos = position + curIndex * pageSize;
        viewholder.tv.setText(mDatas.get(pos).getTitle());
        viewholder.iv.setImageResource(mDatas.get(pos).getImage());
        return convertView;
    }

    class ViewHolder{
        public TextView tv;
        public ImageView iv;
    }

}
