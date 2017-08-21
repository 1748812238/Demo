package com.ryg.demo7_28.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by apple on 17/8/3.
 */

public class ViewPagerAdapter extends PagerAdapter{
    private List<View> ViewList;

    public ViewPagerAdapter(List<View> ViewList){
        this.ViewList = ViewList;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(ViewList.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(ViewList.get(position));
        return (ViewList.get(position));
    }

    @Override
    public int getCount() {
        if(ViewList.size() == 0) {
            return 0;
        }else{
            return ViewList.size();
        }
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
