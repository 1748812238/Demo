package com.ryg.demo7_28.fragment.firstfragment_fragment.lb;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.ryg.demo7_28.R;

/**
 * Created by apple on 17/8/7.
 */

public class ViewFactory {

    public static ImageView getImageView(Context context, String url){
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(R.layout.view_banner,null);
        ImageLoader.getInstance().displayImage(url,imageView);

        return imageView;
    }

}
