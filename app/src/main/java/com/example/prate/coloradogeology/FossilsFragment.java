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
public class FossilsFragment extends Fragment {


    public FossilsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.tour_list, container, false);

            final ArrayList<Tour> tours = new ArrayList<>();

            tours.add(new Tour(R.string.dinosaur_ridge, R.string.dinosaur_ridge_fossils_summary, R.drawable.trace_fossils_dinosaur_ridge_image, R.string.mesa_verde_url));
            tours.add(new Tour(R.string.cañon_city, R.string.cañon_city_fossils_summary, R.drawable.trace_fossils_canon_city_image, R.string.mesa_verde_url));


        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

            listView.setAdapter(adapter);

            return rootView;

        }
    }


