package com.ryg.demo7_28.fragment.firstfragment_fragment.horizontiallistview_mvp;

import android.content.Context;

/**
 * Created by apple on 17/8/22.
 * Horizontiallistview的Presenter层的接口
 */

public interface Horizontiallistview_Presenter {

    void settext(String[] strings,int[] imgs);

    void ontext(Context context);
}
