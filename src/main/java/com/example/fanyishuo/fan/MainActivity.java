package com.example.fanyishuo.fan;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fanyishuo.fan.adapter.Myadapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        viewpager.setAdapter(new Myadapter(getSupportFragmentManager()));
        tablayout.setupWithViewPager(viewpager);
    }
}
