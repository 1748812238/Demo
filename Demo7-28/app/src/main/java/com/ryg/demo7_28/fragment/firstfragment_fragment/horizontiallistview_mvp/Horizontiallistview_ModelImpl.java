package com.ryg.demo7_28.fragment.firstfragment_fragment.horizontiallistview_mvp;

/**
 * Created by apple on 17/8/22.
 * Horizontiallistview的Model层
 */

public class Horizontiallistview_ModelImpl implements Horizontiallistview_Model{
    /**
     * 用于调用Presenter层传递过来的参数的settext()方法,将数据传递到Presenter层
     * @param horizontiallistview_presenter
     */
    @Override
    public void ontext(Horizontiallistview_Presenter horizontiallistview_presenter) {
        String[] strings = new String[]{"1","2","3","4","5","6",};
        horizontiallistview_presenter.settext(strings);
    }
}
