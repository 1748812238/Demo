package com.ryg.demo7_28.fragment.firstfragment_fragment.listviewFragment;

import android.content.Context;
import android.database.Cursor;

import com.ryg.demo7_28.Dao.DBadapter;
import com.ryg.demo7_28.R;

/**
 * Created by apple on 17/8/22.
<<<<<<< HEAD
 */

public class Listview_modelImpl implements Listview_model{
=======
 *  listview的Model层
 */

public class Listview_modelImpl implements Listview_model{

    private DBadapter dBadapter;
    /**
     * 从Presenter层接收过来的Listview_presenter对象，调用onimagetext()方法，将数据传递到Presenter层
     * @param listview_presenter
     */
>>>>>>> dev
    @Override
    public void setimagetext(Listview_presenter listview_presenter, Context context) {
        String[] messages;
        int[] imgs;
        String[] images;

        dBadapter = new DBadapter(context);
        dBadapter.open();
        Cursor cursor = dBadapter.selectsql("select * from lt");
        messages = new String[cursor.getCount()];
        imgs = new int[cursor.getCount()];
        images = new String[cursor.getCount()];
        int i = 0;
        while(cursor.moveToNext()){
            messages[i] = cursor.getString(0);
            images[i] = cursor.getString(1);
            imgs[i] = context.getResources().getIdentifier(images[i],"mipmap","com.ryg.demo7_28");
            i++;
        }
        listview_presenter.onimagetext(messages,imgs);
    }
}
