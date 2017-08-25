package com.ryg.demo7_28.fragment.firstfragment_fragment.lb.lb_mvp;

import android.content.Context;
import android.database.Cursor;

import com.ryg.demo7_28.Dao.DBadapter;

/**
 * Created by apple on 17/8/22.
 */

public class LbModelImpl implements LbModel {
    private DBadapter dBadapter;

    @Override
    public void setImageUrl(LbPresenter lbPresenter,Context context) {
        String[] urls;

        dBadapter = new DBadapter(context);
        dBadapter.open();
        Cursor cursor = dBadapter.selectsql("select * from lb");
        urls = new String[cursor.getCount()];
        int i = 0;
        while(cursor.moveToNext()){
            urls[i] = cursor.getString(0);
            i++;
        }
        lbPresenter.setImageUrls(urls);
    }
}
