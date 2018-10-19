package com.example.prate.coloradogeology;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends SupportMapFragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    public MapsFragment() {
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

        // Add a marker in Sydney and move the camera
        LatLng colorado = new LatLng(39.5501, -105.7821);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(colorado));
        LatLng rockyMountainNP = new LatLng(40.3428, -105.6836);
        LatLng greatSandDunesNP = new LatLng(37.7916, -105.5943);
        LatLng blackCanyonNP = new LatLng(38.5754, -107.7416);
        LatLng mesaVerdeNP = new LatLng(37.2309, -1084618);
        LatLng dinosaurRidgeFossils = new LatLng(39.6942, -105.2000);
        LatLng canonCityFossils = new LatLng(38.4494, -105.2253);
        mMap.addMarker(new MarkerOptions().position(rockyMountainNP).title("Rocky Mountain National Park"));
        mMap.addMarker(new MarkerOptions().position(greatSandDunesNP).title("Great Sand Dunes National Park"));
        mMap.addMarker(new MarkerOptions().position(blackCanyonNP).title("Black Canyon National Park"));
        mMap.addMarker(new MarkerOptions().position(mesaVerdeNP).title("Mesa Verde National Park"));
        mMap.addMarker(new MarkerOptions().position(dinosaurRidgeFossils).title("Dinosaur Ridge"));
        mMap.addMarker(new MarkerOptions().position(canonCityFossils).title("Cañon City Fossils"));
        mMap.addMarker(new MarkerOptions().position(colorado).title("Marker in Colorado"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(colorado, 6), 2000, null);

    }
}
