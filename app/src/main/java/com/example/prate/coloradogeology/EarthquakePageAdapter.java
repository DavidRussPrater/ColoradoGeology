package com.example.prate.coloradogeology;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class EarthquakePageAdapter extends FragmentPagerAdapter{
    //private static final String TAG = CustomFragmentPageAdapter.class.getSimpleName();
    private static final int FRAGMENT_COUNT = 2;
    public EarthquakePageAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new EarthquakesFragment();
            case 1:
                return new EarthquakeMapsFragment();
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
                return "Earthquake List";
            case 1:
                return "Earthquake Map";

        }
        return null;
    }
}

