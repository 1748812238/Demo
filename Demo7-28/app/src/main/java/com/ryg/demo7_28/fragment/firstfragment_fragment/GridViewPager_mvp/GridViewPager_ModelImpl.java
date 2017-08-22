package com.ryg.demo7_28.fragment.firstfragment_fragment.GridViewPager_mvp;

import com.ryg.demo7_28.R;

/**
 * Created by apple on 17/8/22.
 * GridViewPager的Model层存储数据
 */

public class GridViewPager_ModelImpl implements GridViewPager_Model{
    @Override
    public void ontextimage(GridViewPager_Presenter gridViewPager_presenter) {
        String[] titles = new String[]{"Text1","Text2","Text3","Text4","Text5","Text6","Text7","Text8","Text9","Text10"};
        int[] imgs = new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
        gridViewPager_presenter.settextimgs(titles,imgs);
    }
}
