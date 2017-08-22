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
import com.ryg.demo7_28.fragment.firstfragment_fragment.horizontiallistview_mvp.Horizontiallistview;
import com.ryg.demo7_28.fragment.firstfragment_fragment.horizontiallistview_mvp.Horizontiallistview_PresenterImpl;
import com.ryg.demo7_28.view.HorizontialListView;

/**
 * Created by apple on 17/8/1.
 */

public class Horizontiallistview_fragment extends Fragment implements Horizontiallistview{

    private View view; //视图
    private HorizontialListView listView; //自定义的水平listview
    private String[] strings; //
    private Horizontiallistview_PresenterImpl horizontiallistview_presenter; //用于Presenter层的对象的创建

    /**
     * 实现对应布局ID的获取，添加了ItemClickListener监听，并创建了Presenter层的对象调用了其中的ontext()方法获取数据进行布局
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.list_horizontial,container,false);
        horizontiallistview_presenter = new Horizontiallistview_PresenterImpl(this);
        horizontiallistview_presenter.ontext();
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

    /**
     * listview的适配器，实现的对应方法
     */
    private BaseAdapter adapter = new BaseAdapter() {
        /**
         * 返回数据的长度
         * @return
         */
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

        /**
         * 将数据分配到对应的item布局的对应控件中
         * @param position
         * @param convertView
         * @param parent
         * @return
         */
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontiallistview,null);
            TextView title = (TextView) item.findViewById(R.id.img_title);
            title.setText(strings[position]);
            return item;
        }
    };

    /**
     * 供Presenter调用，将数据返回过来
     * @param strings
     */
    @Override
    public void getString(String[] strings) {
        this.strings = strings;
    }
}
