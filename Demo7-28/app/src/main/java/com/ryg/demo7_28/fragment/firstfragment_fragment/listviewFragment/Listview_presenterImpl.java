package com.ryg.demo7_28.fragment.firstfragment_fragment.listviewFragment;

import com.ryg.demo7_28.fragment.firstfragment_fragment.Listview_fragment;

/**
 * Created by apple on 17/8/22.
 */

public class Listview_presenterImpl implements Listview_presenter{

    private Listview_fragment listview_fragment;
    private Listview_modelImpl listview_model;

    public Listview_presenterImpl(Listview_fragment listview_fragment){
        this.listview_fragment = listview_fragment;
        listview_model = new Listview_modelImpl();
    }


    @Override
    public void onimagetext(String[] strings,int[] imgs) {
        listview_fragment.settextimage(strings,imgs);
    }

    @Override
    public void setimagetext() {
        listview_model.setimagetext(this);
    }
}
