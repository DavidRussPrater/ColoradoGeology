package com.example.prate.coloradogeology;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NationalParksFragment extends Fragment {


    public NationalParksFragment() {
        // Required empty public constructor
    }

    private TourAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.tour_list, container, false);

            final ArrayList<Tour> tours = new ArrayList<>();


            tours.add(new Tour(R.string.rocky_mountain_park, R.string.rocky_mountain_summary, R.drawable.rocky_mountain_image, R.string.rocky_mountain_url));
            tours.add(new Tour(R.string.sand_dunes_park, R.string.sand_dunes_summary, R.drawable.sand_dunes_image, R.string.sand_dunes_url));
            tours.add(new Tour(R.string.black_canyon_park, R.string.black_canyon_summary, R.drawable.black_canyon_image, R.string.black_canyon_url));
            tours.add(new Tour(R.string.mesa_verde_park, R.string.mesa_verde_summary, R.drawable.mesa_verde_image, R.string.mesa_verde_url));


        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.activity_image_view);

        mAdapter = new TourAdapter(getActivity(), new ArrayList<Tour>());

        listView.setAdapter(mAdapter);

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            // Find the current earthquake that was clicked on
            Tour currentTour = mAdapter.getItem(position);


            String url = getContext().getString(currentTour.getActivityUrl());
            //String url = getString(getAc)
            // Convert the String URL into a URI object (to pass into the Intent constructor)
            Uri nationalParkUri = Uri.parse(getContext().getString(currentTour.getActivityUrl()));

            // Create a new intent to view the earthquake URI
            Intent websiteIntent = new Intent(Intent.ACTION_VIEW);
            websiteIntent.setData(Uri.parse(url));

            // Send the intent to launch a new activity
            startActivity(websiteIntent);
        }
    });*/

            listView.setAdapter(adapter);

            return rootView;

        }
    }


