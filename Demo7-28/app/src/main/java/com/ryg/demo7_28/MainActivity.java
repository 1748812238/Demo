package com.ryg.demo7_28;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ryg.demo7_28.Dao.Initialization_data;
import com.ryg.demo7_28.fragment.FirstFragment;
import com.ryg.demo7_28.fragment.SecondFragment;
import com.ryg.demo7_28.fragment.ThirdFragment;

public class MainActivity extends FragmentActivity{

    private FirstFragment fg1;
    private SecondFragment fg2;
    private ThirdFragment fg3;

    private FrameLayout frameLayout;

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    private RelativeLayout first;
    private RelativeLayout second;
    private RelativeLayout third;

    private FragmentManager fragmentManager;

    private Initialization_data initialization_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data();
        fragmentManager = getSupportFragmentManager();
        setChioceItem(0);
        initView();
    }

    public void data(){
        SharedPreferences sharedPreferences = getSharedPreferences("is",MODE_PRIVATE);
        boolean isfer = sharedPreferences.getBoolean("isfer",true);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if(isfer){
            initialization_data = new Initialization_data(this);
            editor.putBoolean("isfer",false);
            editor.commit();
        }
    }

    /**
     * 组件的获取，对于组件事件的监听
     */
    private void initView() {
        first = (RelativeLayout) findViewById(R.id.first_layout);
        second = (RelativeLayout) findViewById(R.id.second_layout);
        third = (RelativeLayout) findViewById(R.id.third_layout);

        tv1 = (TextView) findViewById(R.id.one);
        tv2 = (TextView) findViewById(R.id.two);
        tv3 = (TextView) findViewById(R.id.three);

        first.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setChioceItem(0);
                first.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.white));
                second.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.black));
                third.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.black));
            }
        });

        second.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setChioceItem(1);
                first.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.black));
                second.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.white));
                third.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.black));
            }
        });

        third.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setChioceItem(2);
                first.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.black));
                second.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.black));
                third.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.white));
            }
        });

    }


    /**
     * 通过传递过来的数值，将对应的布局添加到transacion上
     * @param index
     */
    private void setChioceItem(int index){
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideFragments(transaction);
        switch (index){
            case 0:
                if(fg1 == null){
                    fg1 = new FirstFragment();
                    transaction.add(R.id.content,fg1);
                }else{
                    transaction.show(fg1);
                }
                break;
            case 1:
                if(fg2 == null){
                    fg2 = new SecondFragment();
                    transaction.add(R.id.content,fg2);
                }else{
                    transaction.show(fg2);
                }
                break;
            case 2:
                if(fg3 == null){
                    fg3 = new ThirdFragment();
                    transaction.add(R.id.content,fg3);
                }else{
                    transaction.show(fg3);
                }
                break;
        }
        transaction.commit();
    }

    /**
     * 隐藏对应的视图
     * @param transaction
     */
    private void hideFragments(FragmentTransaction transaction) {
        if(fg1 != null){
            transaction.hide(fg1);
        }
        if(fg2 !=null){
            transaction.hide(fg2);
        }
        if(fg3 != null){
            transaction.hide(fg3);
        }
    }

}
