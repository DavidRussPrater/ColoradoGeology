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
public class GeologicSummaryFragment extends Fragment {


    public GeologicSummaryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(R.string.geologic_summary_of_colorado_title, R.string.geologic_summary, R.drawable.boulderbearpeak));

        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
