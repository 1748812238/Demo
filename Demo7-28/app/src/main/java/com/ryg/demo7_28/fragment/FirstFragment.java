package com.ryg.demo7_28.fragment;


import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.ryg.demo7_28.fragment.firstfragment_fragment.GridViewViewPager_Fragment;
import com.ryg.demo7_28.view.MyScrollView;
import com.ryg.demo7_28.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by apple on 17/7/28.
 */

public class FirstFragment extends Fragment {

    private View mView;
    private MyScrollView scrollview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mView = LayoutInflater.from(getActivity()).inflate(R.layout.activity_one,null);
        setView();
        getFragmentManager().beginTransaction().add(R.id.fragment_gridview,new GridViewViewPager_Fragment()).commit();
        return mView;
    }

    private void setView() {
        scrollview = (MyScrollView) mView.findViewById(R.id.scrollview);
        scrollview.smoothScrollTo(0,0);

    }
}
