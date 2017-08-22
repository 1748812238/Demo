package com.ryg.demo7_28.fragment.firstfragment_fragment;


import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.ryg.demo7_28.R;
import com.ryg.demo7_28.fragment.firstfragment_fragment.listviewFragment.Listview_presenterImpl;
import com.ryg.demo7_28.fragment.firstfragment_fragment.listviewFragment.Listviewinterface;
import com.ryg.demo7_28.view.ListViewForScrollView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by apple on 17/7/31.
 */

public class Listview_fragment extends ListFragment implements Listviewinterface{

//    String[] strings = {"TextView","TextView","TextView","TextView","TextView",};
//    int[] imgs = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,};

    private SimpleAdapter adapter;

    private View view;

    private ListViewForScrollView listViewForScrollView;

    private Listview_presenterImpl listview_presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.list,container,false);

//        listViewForScrollView = (ListViewForScrollView) view.findViewById(R.id.listviewforscrollview);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
//        String[] from = new String[]{"img","title"};
//        int[] to = new int[]{R.id.img,R.id.title};
//
        super.onCreate(savedInstanceState);
//        adapter = new SimpleAdapter(this.getActivity(),getSimpleData(),R.layout.item,from,to);
        listview_presenter = new Listview_presenterImpl(this);
        listview_presenter.setimagetext();

        this.setListAdapter(adapter);
    }

    private List<Map<String, Object>> getSimpleData(String[] strings,int[] imgs){
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

//        Listview_fragment listview_fragment = new Listview_fragment();

        Map<String, Object> map;
        for(int i = 0;i < strings.length ;i++){
            map = new HashMap<String, Object>();
            map.put("img",imgs[i]);
            map.put("title",strings[i]);
            list.add(map);
        }
        return list;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getActivity(),"You have selected" + position,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void settextimage(String[] strings, int[] images) {
        String[] from = new String[]{"img","title"};
        int[] to = new int[]{R.id.img,R.id.title};

        adapter = new SimpleAdapter(this.getActivity(),getSimpleData(strings,images),R.layout.item,from,to);
    }
}
