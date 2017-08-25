package com.ryg.demo7_28.fragment.firstfragment_fragment.lb.lb_mvp;

import android.content.Context;

/**
 * Created by apple on 17/8/22.
 */

public interface LbPresenter {

    void onImageUrls(Context context);

    void setImageUrls(String[] urls);
}
