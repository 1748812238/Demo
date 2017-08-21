package com.ryg.demo7_28.fragment.firstfragment_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.ryg.demo7_28.R;
import com.ryg.demo7_28.view.HorizontialListView;

/**
 * Created by apple on 17/8/1.
 */

public class Horizontiallistview_fragment extends Fragment{

    private View view;
    private HorizontialListView listView;
    private String[] strings = new String[]{"1","2","3","4","5","6",};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.list_horizontial,container,false);
        listView = (HorizontialListView) view.findViewById(R.id.horizontial_listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),"you have selected horizontiallistview" + position,Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    private BaseAdapter adapter = new BaseAdapter() {
        @Override
        public int getCount() {
            return strings.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontiallistview,null);
            TextView title = (TextView) item.findViewById(R.id.img_title);
            title.setText(strings[position]);
            return item;
        }
    };


}
