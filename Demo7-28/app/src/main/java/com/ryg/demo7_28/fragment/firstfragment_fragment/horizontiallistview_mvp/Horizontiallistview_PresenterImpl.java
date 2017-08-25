package com.ryg.demo7_28.fragment.firstfragment_fragment.horizontiallistview_mvp;

import android.content.Context;

/**
 * Created by apple on 17/8/22.
 * Horizontiallistview的Presenter层
 */

public class Horizontiallistview_PresenterImpl implements Horizontiallistview_Presenter {

    private Horizontiallistview horizontiallistview; //用于接受从View层传递过来的Horizontiallistview对象
    private Horizontiallistview_ModelImpl horizontiallistview_model; //用于创建Model层的对象

    /**
     * 接受从View层传递过来的Horizontiallistview对象，创建Model层的对象
     * @param horizontiallistview
     */
    public Horizontiallistview_PresenterImpl(Horizontiallistview horizontiallistview){
        this.horizontiallistview = horizontiallistview;
        horizontiallistview_model = new Horizontiallistview_ModelImpl();
    }

    /**
     * 接受从Model层传递过来的数据，并调用View层的getString()方法将数据传递到View层
     * @param strings
     */
    @Override
    public void settext(String[] strings,int[] imgs) {
        horizontiallistview.getString(strings);
        horizontiallistview.getimages(imgs);
    }

    /**
     * 调用Model层的ontext()方法获取数据
     */
    @Override
    public void ontext(Context context) {
        horizontiallistview_model.ontext(this,context);
    }
}
