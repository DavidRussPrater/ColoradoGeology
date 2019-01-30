package com.example.prate.coloradogeology;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class EarthquakeTabsFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public EarthquakeTabsFragment() {
        // Required empty public constructor
    }

    /**
      Set up a ViewPager and tab layout to handle the Earthquakes tabs
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.earthquake_tabs, container, false);
        tabLayout = (TabLayout)view.findViewById(R.id.tabs);
        viewPager = (ViewPager)view.findViewById(R.id.view_pager);
        viewPager.setAdapter(new EarthquakePageAdapter(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }


}
