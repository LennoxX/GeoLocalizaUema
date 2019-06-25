package com.example.geolocalizauema;

import androidx.appcompat.app.AppCompatActivity;

import com.example.geolocalizauema.utils.Marcador;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private static final float ZOOM_LEVEL = 16.0f;

    private GoogleMap mMap;
    Marker marker;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        marker = mMap.addMarker(new MarkerOptions().title("").position(new LatLng(1, 1)));
        marker.setVisible(false);

    }

    public void setMark(Marcador marcador) {
        marker.setVisible(true);
        marker.setTitle(marcador.getTitulo());
        marker.setPosition(marcador.getCoordenada());
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marcador.getCoordenada(), ZOOM_LEVEL));
    }
}
