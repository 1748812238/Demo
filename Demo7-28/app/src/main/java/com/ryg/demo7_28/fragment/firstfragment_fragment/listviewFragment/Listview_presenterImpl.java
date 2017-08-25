package com.ryg.demo7_28.fragment.firstfragment_fragment.listviewFragment;

import android.content.Context;

import com.ryg.demo7_28.fragment.firstfragment_fragment.Listview_fragment;

/**
 * Created by apple on 17/8/22.
<<<<<<< HEAD
=======
 * listview的Presenter层
>>>>>>> dev
 */

public class Listview_presenterImpl implements Listview_presenter{

<<<<<<< HEAD
    private Listview_fragment listview_fragment;
    private Listview_modelImpl listview_model;

=======
    private Listview_fragment listview_fragment; //用于接收从View层传递过来的参数
    private Listview_modelImpl listview_model; //用于创建Model层的对象

    /**
     * 从View层接收参数，创建Model层的对象
     * @param listview_fragment
     */
>>>>>>> dev
    public Listview_presenterImpl(Listview_fragment listview_fragment){
        this.listview_fragment = listview_fragment;
        listview_model = new Listview_modelImpl();
    }

<<<<<<< HEAD

=======
    /**
     * 从Model层接收过来的数据传递到View层
     * @param strings
     * @param imgs
     */
>>>>>>> dev
    @Override
    public void onimagetext(String[] strings,int[] imgs) {
        listview_fragment.settextimage(strings,imgs);
    }

<<<<<<< HEAD
=======
    /**
     * 调用Model层的setimagetext()方法
     */
>>>>>>> dev
    @Override
    public void setimagetext(Context context) {
        listview_model.setimagetext(this,context);
    }
}
