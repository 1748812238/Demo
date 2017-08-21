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
//    private ViewPager mViewPager;
//    private List<ImageView> images;
//    private int currentItem;
//    private int oldPosition = 0;
//    private int[] imageIds = new int[]{
//            R.mipmap.pag1,
//            R.mipmap.pag2,
//            R.mipmap.pag3,
//    };
//
//    private String[] titles = new String[]{
//            "one",
//            "two",
//            "three",
//    };
//
//
//    private TextView title;
//    private ViewPagerAdapter adapter;
//    private ScheduledExecutorService scheduledExecutorService;
//
//    private List<Map<String,Object>> mData;
//    private int flag;
//    private ListView listView;
//
//    private SimpleAdapter simpleAdapter;
    private MyScrollView scrollview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mView = LayoutInflater.from(getActivity()).inflate(R.layout.activity_one,null);
        setView();
        getFragmentManager().beginTransaction().add(R.id.fragment_gridview,new GridViewViewPager_Fragment()).commit();
        return mView;
    }
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        String[] listItem = {"a","b","c","d","e"};
//        int[] iconItem = {R.mipmap.pag4,R.mipmap.pag4,R.mipmap.pag4,R.mipmap.pag4,R.mipmap.pag4};
//        simpleAdapter = new SimpleAdapter(getActivity(),getData(listItem,iconItem),R.layout.list,new String[]{"name","icon"},new int[] {R.id.functionName,R.id.functionIcon});
//        setListAdapter(simpleAdapter);
//    }
//
//    public void onListItemClick(ListView l,View v,int position,long id){
//        super.onListItemClick(l,v,position,id);
//    }
//
//    private List<? extends Map<String,?>> getData(String[] strs,int[] icon){
//        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
//
//        for(int i = 0;i < 5; i++){
//            Map<String,Object> map = new HashMap<String, Object>();
//            map.put("name",strs[i]);
//            map.put("icon",icon[i]);
//            list.add(map);
//        }
//
//        return list;
//    }
//
//    public void onActivityCreated(Bundle savedInstanceState){
//        super.onActivityCreated(savedInstanceState);
//    }

    private void setView() {
//        mViewPager = (ViewPager) mView.findViewById(R.id.vp);
        scrollview = (MyScrollView) mView.findViewById(R.id.scrollview);
        scrollview.smoothScrollTo(0,0);
//        listView = (ListView) mView.findViewById(R.id.list_view);

//        listView = (ListView) mView.findViewById(R.id.listview);

//        images = new ArrayList<ImageView>();
//        for(int i = 0; i < imageIds.length; i++){
//            ImageView imageView = new ImageView(getActivity());
//            imageView.setBackgroundResource(imageIds[i]);
//            images.add(imageView);
//        }
//        title = (TextView) mView.findViewById(R.id.title);
//        title.setText(titles[0]);
//        adapter = new ViewPagerAdapter();
//        listView.addHeaderView(mViewPager);
//        mViewPager.setAdapter(adapter);
//        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){
//
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                title.setText(titles[position]);
//
//                oldPosition = position;
//                currentItem = position;
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
    }
//
//
//    private class ViewPagerAdapter extends PagerAdapter{
//        @Override
//        public int getCount() {
//            return imageIds.length;
//        }
//
//        @Override
//        public boolean isViewFromObject(View view, Object object) {
//            return view == object;
//        }
//
//        @Override
//        public void destroyItem(ViewGroup container, int position, Object object) {
//            container.removeView(images.get(position));
//        }
//
//        @Override
//        public Object instantiateItem(ViewGroup container, int position) {
//            container.addView(images.get(position));
//            return images.get(position);
//        }
//    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
//        scheduledExecutorService.scheduleWithFixedDelay(
//                new ViewPageTask(),
//                2,
//                2,
//                TimeUnit.SECONDS
//        );
//    }
//
//    private class ViewPageTask implements Runnable{
//        @Override
//        public void run() {
//            currentItem = (currentItem + 1) % imageIds.length;
//            mHandler.sendEmptyMessage(0);
//        }
//    }
//
//    private Handler mHandler = new Handler(){
//        public void handleMessage(android.os.Message msg){
//            mViewPager.setCurrentItem(currentItem);
//        }
//    };
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        if(scheduledExecutorService != null){
//            scheduledExecutorService.shutdown();
//            scheduledExecutorService = null;
//        }
//    }
}
