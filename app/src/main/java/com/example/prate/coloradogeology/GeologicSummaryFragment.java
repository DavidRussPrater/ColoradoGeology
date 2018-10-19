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

        // Create a list of to store a picture of colorado and the geologic summary of the state.
        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(R.string.geologic_summary_of_colorado_title, R.string.geologic_summary, R.drawable.boulderbearpeak));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tours}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link TourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Tour} in the list
        listView.setAdapter(adapter);

        return rootView;

    }

}
