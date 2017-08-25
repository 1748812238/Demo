package com.ryg.demo7_28.fragment.firstfragment_fragment.lb.lb_mvp;

import android.content.Context;

/**
 * Created by apple on 17/8/22.
 */

public class LbPresenterImpl implements LbPresenter {

    private LbView lbView;
    private LbModelImpl lbModel;

    public LbPresenterImpl(LbView lbView){
        this.lbView = lbView;
        lbModel = new LbModelImpl();
    }

    @Override
    public void onImageUrls(Context context) {
        lbModel.setImageUrl(this,context);
    }

    @Override
    public void setImageUrls(String[] urls) {
        lbView.initialize(urls);
    }
}
