package com.example.fanyishuo.fan.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.fanyishuo.fan.MyFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fanyishuo on 2017/8/2.
 */

public class Myadapter extends FragmentPagerAdapter {
    private String[] titles={"推荐", "热点", "北京", "视频", "军事娱乐", "热点", "北京", "视频", "军事娱乐"};
    private List<Fragment> list=new ArrayList<>();

    public Myadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        MyFragment myFragment=new MyFragment();
        Bundle bundle=new Bundle();
        bundle.putString("text",titles[position]);
        myFragment.setArguments(bundle);
        return myFragment;
    }

    @Override
    public int getCount() {
        return titles!=null?titles.length:0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
