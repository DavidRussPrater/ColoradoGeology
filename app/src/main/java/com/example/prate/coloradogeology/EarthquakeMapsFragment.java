package com.example.prate.coloradogeology;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.example.prate.coloradogeology.QueryUtils.latitudeArray;
import static com.example.prate.coloradogeology.QueryUtils.locationArray;
import static com.example.prate.coloradogeology.QueryUtils.longitudeArray;
import static com.example.prate.coloradogeology.QueryUtils.magnitudeArray;

public class EarthquakeMapsFragment extends SupportMapFragment implements OnMapReadyCallback  {

    private GoogleMap mMap;

    public EarthquakeMapsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_maps_fragment);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.*/getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Define the Long and Lat of Colorado and move the camera here
        LatLng colorado = new LatLng(39.5501, -105.7821);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(colorado));

        // This for loop displays the fifteen most recent earthquakes in Colorado
        for (int i = 0; i < 15; i++) {

            // Get the string value for the earthquakes longitude at index i and convert it from a String
            // to a double to display on the map
            String finalLongitudeString = longitudeArray[i];
            double longitudeDouble = Double.parseDouble(finalLongitudeString);

            // Get the string value for the earthquakes latitude at index i and convert it from a String
            // to a double to display on the map
            String finalLatitudeString = latitudeArray[i];
            double latitudeDouble = Double.parseDouble(finalLatitudeString);

            // Add the corresponding Lat and Long values to the and set the title of the pin to
            // "Location : Magnitude" and add them to the map
            LatLng earthquake = new LatLng(latitudeDouble, longitudeDouble);
            mMap.addMarker(new MarkerOptions().position(earthquake).title(locationArray[i] + " Magnitude: " + magnitudeArray[i]));

        }

        // Make the camera zoom in to show the full state of Colorado
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(colorado, 6), 2000, null);


    }
}
