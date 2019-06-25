package com.azhar.hurufhijaiyyah.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.azhar.hurufhijaiyyah.fragment.FragmentDhomah;
import com.azhar.hurufhijaiyyah.fragment.FragmentFathah;
import com.azhar.hurufhijaiyyah.fragment.FragmentHijaiyyah;
import com.azhar.hurufhijaiyyah.fragment.FragmentKasrah;

public class HijaiyyahAdapter extends FragmentStatePagerAdapter {
    public HijaiyyahAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag = null;
        switch (position) {
            case 0:
                frag = new FragmentHijaiyyah();
                break;
            case 1:
                frag = new FragmentDhomah();
                break;
            case 2:
                frag = new FragmentKasrah();
                break;
            case 3:
                frag = new FragmentFathah();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = " ";
        switch (position) {
            case 0:
                title = "Huruf Hijaiyyah";
                break;
            case 1:
                title = "Huruf Hijaiyyah Dhomah";
                break;
            case 2:
                title = "Huruf Hijaiyyah Kasrah";
                break;
            case 3:
                title = "Huruf Hijaiyyah Fathah";
                break;
        }

        return title;
    }
}
