package com.example.prate.coloradogeology;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class NationalParksPageAdapter extends FragmentPagerAdapter {

    private static final int FRAGMENT_COUNT = 2;
    public NationalParksPageAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new NationalParksFragment();
            case 1:
                return new NationalParksMapsFragment();
        }
        return null;
    }
    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "National Parks";
            case 1:
                return "Map of Parks";

        }
        return null;
    }
}
