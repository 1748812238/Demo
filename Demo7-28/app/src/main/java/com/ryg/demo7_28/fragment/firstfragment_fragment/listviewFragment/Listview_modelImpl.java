package com.ryg.demo7_28.fragment.firstfragment_fragment.listviewFragment;

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

    /**
     * 从Presenter层接收过来的Listview_presenter对象，调用onimagetext()方法，将数据传递到Presenter层
     * @param listview_presenter
     */
>>>>>>> dev
    @Override
    public void setimagetext(Listview_presenter listview_presenter) {
        String[] messages = {"TextView","TextView","TextView","TextView","TextView",};
        int[] imgs = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,};
        listview_presenter.onimagetext(messages,imgs);
    }
}
