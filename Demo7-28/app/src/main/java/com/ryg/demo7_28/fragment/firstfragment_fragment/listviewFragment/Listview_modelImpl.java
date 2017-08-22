package com.ryg.demo7_28.fragment.firstfragment_fragment.listviewFragment;

import com.ryg.demo7_28.R;

/**
 * Created by apple on 17/8/22.
 */

public class Listview_modelImpl implements Listview_model{
    @Override
    public void setimagetext(Listview_presenter listview_presenter) {
        String[] messages = {"TextView","TextView","TextView","TextView","TextView",};
        int[] imgs = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,};
        listview_presenter.onimagetext(messages,imgs);
    }
}
