package com.ryg.demo7_28.fragment.firstfragment_fragment.GridViewPager_mvp;

import android.content.Context;
import android.database.Cursor;

import com.ryg.demo7_28.Dao.DBadapter;
import com.ryg.demo7_28.R;

/**
 * Created by apple on 17/8/22.
 * GridViewPager的Model层存储数据
 */

public class GridViewPager_ModelImpl implements GridViewPager_Model{
    private DBadapter dBadapter;

    @Override
    public void ontextimage(GridViewPager_Presenter gridViewPager_presenter, Context context) {
        String[] titles;
        String[] images;
        int[] imgs;


        dBadapter = new DBadapter(context);
        dBadapter.open();
        Cursor cursor = dBadapter.selectsql("select * from gv");
        titles = new String[cursor.getCount()];
        imgs = new int[cursor.getCount()];
        images = new String[cursor.getCount()];
        int i = 0;
        while(cursor.moveToNext()){
            titles[i] = cursor.getString(0);
            images[i] = cursor.getString(1);
            imgs[i] = context.getResources().getIdentifier(images[i],"mipmap","com.ryg.demo7_28");
            i++;
        }
        dBadapter.close();

        gridViewPager_presenter.settextimgs(titles,imgs);
    }
}
