package com.ryg.demo7_28.fragment.firstfragment_fragment.lb;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.ryg.demo7_28.Bean.Bean_lb;
import com.ryg.demo7_28.R;
import com.ryg.demo7_28.fragment.firstfragment_fragment.lb.lb_mvp.LbPresenterImpl;
import com.ryg.demo7_28.fragment.firstfragment_fragment.lb.lb_mvp.LbView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 17/8/7.
 */

public class Lb_fragment extends Fragment implements LbView{

    private View view;

    private LbPresenterImpl lbPresenter;

    private List<ImageView> views = new ArrayList<ImageView>();
    private List<Bean_lb> beans = new ArrayList<Bean_lb>();
    private CycleViewPager lbViewPager;

//    private String[] urls = new String[]{
//            "http://pic30.nipic.com/20130626/8174275_085522448172_2.jpg",
//            "http://pic18.nipic.com/20111215/577405_080531548148_2.jpg",
//            "http://pic15.nipic.com/20110722/2912365_092519919000_2.jpg"
//    };


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = LayoutInflater.from(getActivity()).inflate(R.layout.view_lb,null);
        configImageLoader();
        lbPresenter = new LbPresenterImpl(this);
        lbPresenter.onImageUrls(getActivity());
        return view;
    }

//    private void initialize() {
//        lbViewPager = (CycleViewPager) getFragmentManager().findFragmentById(R.id.lb_fragment);
//
//        for(int i = 0; i < urls.length; i++){
//            Bean_lb bean = new Bean_lb();
//            bean.setUrl(urls[i]);
//            bean.setContext("-->" + i);
//            beans.add(bean);
//        }
//        views.add(ViewFactory.getImageView(getActivity(), beans.get(beans.size() - 1).getUrl()));
//        for (int i = 0; i < beans.size(); i++) {
//            views.add(ViewFactory.getImageView(getActivity(), beans.get(i).getUrl()));
//        }
//        views.add(ViewFactory.getImageView(getActivity(), beans.get(0).getUrl()));
//
//        lbViewPager.setCycle(true);
//
//        lbViewPager.setData(views, beans, mAdCycleViewListener);
//        lbViewPager.setWheel(true);
//
//        lbViewPager.setTime(2000);
//        lbViewPager.setIndicatorCenter();
//
//    }

    private CycleViewPager.ImageCycleViewListener mAdCycleViewListener = new CycleViewPager.ImageCycleViewListener() {
        @Override
        public void onImageClick(Bean_lb info, int postion, View imageView) {
                postion = postion - 1;
                Toast.makeText(getActivity(),
                        "position-->" + info.getContext(), Toast.LENGTH_SHORT)
                        .show();
        }
    };


    private void configImageLoader() {
        DisplayImageOptions position = new DisplayImageOptions.Builder().showStubImage(R.drawable.icon_stub)
                .showImageForEmptyUri(R.drawable.icon_empty)
                .showImageOnFail(R.drawable.icon_error)
                .cacheInMemory(true)
                .cacheOnDisc(true).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getActivity()).defaultDisplayImageOptions(position)
                .threadPriority(Thread.NORM_PRIORITY - 2).denyCacheImageMultipleSizesInMemory()
                .discCacheFileNameGenerator(new Md5FileNameGenerator()).tasksProcessingOrder(QueueProcessingType.FIFO).build();
        ImageLoader.getInstance().init(config);
    }

    @Override
    public void initialize(String[] urls) {
        lbViewPager = (CycleViewPager) getFragmentManager().findFragmentById(R.id.lb_fragment);

        for(int i = 0; i < urls.length; i++){
            Bean_lb bean = new Bean_lb();
            bean.setUrl(urls[i]);
            bean.setContext("-->" + i);
            beans.add(bean);
        }
        views.add(ViewFactory.getImageView(getActivity(), beans.get(beans.size() - 1).getUrl()));
        for (int i = 0; i < beans.size(); i++) {
            views.add(ViewFactory.getImageView(getActivity(), beans.get(i).getUrl()));
        }
        views.add(ViewFactory.getImageView(getActivity(), beans.get(0).getUrl()));

        lbViewPager.setCycle(true);

        lbViewPager.setData(views, beans, mAdCycleViewListener);
        lbViewPager.setWheel(true);

        lbViewPager.setTime(2000);
        lbViewPager.setIndicatorCenter();
    }
}
