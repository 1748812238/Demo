package com.ryg.demo7_28.fragment.firstfragment_fragment.GridViewPager_mvp;

import android.content.Context;

/**
 * Created by apple on 17/8/22.
 * GridViewPager的Presenter层的接口
 */

public interface GridViewPager_Presenter {
    void settextimgs(String[] strings,int[] imgs);

    void ontextimgs(Context context);

}
