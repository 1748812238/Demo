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
import com.ryg.demo7_28.fragment.firstfragment_fragment.GridViewPager_mvp.GridViewPager;
import com.ryg.demo7_28.fragment.firstfragment_fragment.GridViewPager_mvp.GridViewPager_PresenterImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 17/8/3.
 */

public class GridViewViewPager_Fragment extends Fragment implements GridViewPager{

    private ViewPager viewPager; //用于获取布局中的viewpager组件
    private List<View> PagerList; //用于存储item的view视图
    private List<Bean> mDatas; //用于存储item中的数据
    private LayoutInflater inflaters; //用于获取其他布局的ID
    private int PagerCount; //页数
    private int PagerSize = 8; //一页所显示的item个数
    private View view; //视图

    private GridViewPager_PresenterImpl gridViewPager_presenter;

    /**
     * 通过自定义的GridViewAdapter的实现分页操作，对每个item进行监听
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_gridview,container,false);
        viewPager = (ViewPager) view.findViewById(R.id.gridview_vp);

        gridViewPager_presenter = new GridViewPager_PresenterImpl(this);
        gridViewPager_presenter.ontextimgs(getActivity());

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

    /**
     * 将从Presenter层传递过来的数据用for循环添加到mDatas列表中
     * @param strings
     * @param imgs
     */
    @Override
    public void initDatas(String[] strings, int[] imgs) {
        mDatas = new ArrayList<Bean>();
        for(int i = 0;i < strings.length;i++){
            mDatas.add(new Bean(strings[i],imgs[i]));
        }
    }
}
