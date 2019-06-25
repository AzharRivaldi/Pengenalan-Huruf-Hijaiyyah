package com.azhar.hurufhijaiyyah;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.azhar.hurufhijaiyyah.adapter.HijaiyyahAdapter;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("Huruf Hijaiyyah");

        viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(new HijaiyyahAdapter(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(4);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
