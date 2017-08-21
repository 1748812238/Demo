package com.ryg.demo7_28.Bean;

/**
 * Created by apple on 17/8/3.
 */

public class Bean {
    private String title;
    private int image;

    public Bean(String title,int image){
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
