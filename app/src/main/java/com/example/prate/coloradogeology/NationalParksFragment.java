package com.example.prate.coloradogeology;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NationalParksFragment extends Fragment {


    public NationalParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.tour_list, container, false);

            final ArrayList<Tour> tours = new ArrayList<>();


            tours.add(new Tour(R.string.rocky_mountain_park, R.string.rocky_mountain_summary, R.drawable.rocky_mountain_image));
            tours.add(new Tour(R.string.sand_dunes_park, R.string.sand_dunes_summary, R.drawable.sand_dunes_image));
            tours.add(new Tour(R.string.black_canyon_park, R.string.black_canyon_summary, R.drawable.black_canyon_image));
            tours.add(new Tour(R.string.mesa_verde_park, R.string.mesa_verde_summary, R.drawable.mesa_verde_image));


        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

            listView.setAdapter(adapter);

            return rootView;

        }
    }


