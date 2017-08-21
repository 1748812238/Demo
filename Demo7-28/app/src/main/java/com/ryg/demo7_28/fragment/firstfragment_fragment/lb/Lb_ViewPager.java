package com.ryg.demo7_28.fragment.firstfragment_fragment.lb;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by apple on 17/8/7.
 */

public class Lb_ViewPager extends ViewPager{
    private boolean scroll = true;

    public Lb_ViewPager(Context context) {
        super(context);
    }

    public Lb_ViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setScrollable(boolean enable){
        scroll = enable;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(scroll){
            return super.onInterceptTouchEvent(ev);
        }else{
            return false;
        }
    }
}
