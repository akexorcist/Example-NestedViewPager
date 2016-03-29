package com.akexorcist.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Akexorcist on 3/30/2016 AD.
 */
public class MainAdapter extends FragmentStatePagerAdapter {
    public MainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return P1Fragment.newInstance();
        } else if (position == 1) {
            return P2Fragment.newInstance();
        }
        return P3Fragment.newInstance();
    }

    @Override
    public int getCount() {
        return 10;
    }
}
