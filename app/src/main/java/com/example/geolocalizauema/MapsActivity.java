package com.example.geolocalizauema;

import androidx.appcompat.app.AppCompatActivity;

import com.example.geolocalizauema.utils.Marcador;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity  implements OnMapReadyCallback {

    private static final float ZOOM_LEVEL = 16.0f;

    private GoogleMap mMap;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


    }

    public void setMark(Marcador marcador){
        LatLng latLng = new LatLng(marcador.getCoordenada().latitude, marcador.getCoordenada().longitude);
        mMap.addMarker(new MarkerOptions().position(latLng).title(marcador.getTitulo()));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        mMap.animateCamera(CameraUpdateFactory.zoomBy(ZOOM_LEVEL));
    }
}
