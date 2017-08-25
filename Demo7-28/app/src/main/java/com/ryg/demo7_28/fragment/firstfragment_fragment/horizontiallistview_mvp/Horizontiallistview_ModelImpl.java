package com.ryg.demo7_28.fragment.firstfragment_fragment.horizontiallistview_mvp;

import android.content.Context;
import android.database.Cursor;

import com.ryg.demo7_28.Dao.DBadapter;

/**
 * Created by apple on 17/8/22.
 * Horizontiallistview的Model层
 */

public class Horizontiallistview_ModelImpl implements Horizontiallistview_Model{

    private DBadapter dBadapter;
    /**
     * 用于调用Presenter层传递过来的参数的settext()方法,将数据传递到Presenter层
     * @param horizontiallistview_presenter
     */
    @Override
    public void ontext(Horizontiallistview_Presenter horizontiallistview_presenter, Context context) {
        String[] strings;
        int[] imgs;
        String[] images;

        dBadapter = new DBadapter(context);
        dBadapter.open();
        Cursor cursor = dBadapter.selectsql("select * from hz");
        strings = new String[cursor.getCount()];
        imgs = new int[cursor.getCount()];
        images = new String[cursor.getCount()];
        int i = 0;
        while(cursor.moveToNext()){
            strings[i] = cursor.getString(0);
//            images[i] = cursor.getString(1);
//            imgs[i] = context.getResources().getIdentifier(images[i],"mipmap","com.ryg.demo7_28");
            i++;
        }

        horizontiallistview_presenter.settext(strings,imgs);

//        horizontiallistview_presenter.settext(strings);
    }
}
