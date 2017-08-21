package com.ryg.demo7_28.fragment.firstfragment_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.ryg.demo7_28.Bean.Bean;
import com.ryg.demo7_28.R;
import com.ryg.demo7_28.adapter.GridViewAdapter;
import com.ryg.demo7_28.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 17/8/3.
 */

public class GridViewViewPager_Fragment extends Fragment{

    private String[] titles = new String[]{"Text1","Text2","Text3","Text4","Text5","Text6","Text7","Text8","Text9","Text10"};
    private ViewPager viewPager;
    private List<View> PagerList;
    private List<Bean> mDatas;
    private LayoutInflater inflaters;
    private int PagerCount;
    private int PagerSize = 8;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_gridview,container,false);
        viewPager = (ViewPager) view.findViewById(R.id.gridview_vp);
        initDatas();
        inflaters = inflater.from(view.getContext());
        PagerCount = (int) Math.ceil(mDatas.size() * 1.0 / PagerSize);
        PagerList = new ArrayList<View>();
        for(int i = 0;i < PagerCount;i++){
            GridView gridview = (GridView) inflaters.inflate(R.layout.gridview,viewPager,false);
            gridview.setAdapter(new GridViewAdapter(mDatas,view.getContext(),PagerSize,i));
            PagerList.add(gridview);

            gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(view.getContext(),mDatas.get((int)id).getTitle(),Toast.LENGTH_SHORT).show();
                }
            });
        }

        viewPager.setAdapter(new ViewPagerAdapter(PagerList));
        return view;
    }

    private void initDatas() {
        mDatas = new ArrayList<Bean>();
        for(int i = 0;i < titles.length;i++){
            mDatas.add(new Bean(titles[i],R.mipmap.ic_launcher));
        }
    }
}
