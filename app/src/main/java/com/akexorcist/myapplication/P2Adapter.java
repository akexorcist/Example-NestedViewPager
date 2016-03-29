package com.akexorcist.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Akexorcist on 3/30/2016 AD.
 */
public class P2Adapter extends FragmentPagerAdapter {
    public P2Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return P2S1Fragment.newInstance(position);
        }
        return P2S2Fragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 5;
    }
}
