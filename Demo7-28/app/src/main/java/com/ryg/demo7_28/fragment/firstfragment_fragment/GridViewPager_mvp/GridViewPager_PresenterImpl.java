package com.ryg.demo7_28.fragment.firstfragment_fragment.GridViewPager_mvp;

/**
 * Created by apple on 17/8/22.
 * GridViewPager的Presenter层
 */

public class GridViewPager_PresenterImpl implements GridViewPager_Presenter {

    private GridViewPager gridViewPager; //用来获取View层传递过来的参数
    private GridViewPager_ModelImpl gridViewPager_model; //用来创建Model层的对象

    /**
     * 用来接收View层的参数，并创建Model层的对象
     * @param gridViewPager
     */
    public GridViewPager_PresenterImpl(GridViewPager gridViewPager){
        this.gridViewPager = gridViewPager;
        gridViewPager_model = new GridViewPager_ModelImpl();
    }

    /**
     * 从Model层接收参数，并调用View层的方法将参数传递到View层
     * @param strings
     * @param imgs
     */
    @Override
    public void settextimgs(String[] strings, int[] imgs) {
        gridViewPager.initDatas(strings,imgs);
    }

    /**
     * 调用Model层的方法获取参数
     */
    @Override
    public void ontextimgs() {
        gridViewPager_model.ontextimage(this);
    }
}
