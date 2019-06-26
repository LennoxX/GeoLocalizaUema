package com.example.geolocalizauema;

import android.os.Bundle;

import com.example.geolocalizauema.utils.Coordenadas;
import com.example.geolocalizauema.utils.Marcador;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private GoogleMap mMap;

    public MapsActivity mapsActivity = new MapsActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        // ADICIONANDO REFERÊNCIA DO MAPS ACTIVITY
        FragmentManager fragmentManager = getSupportFragmentManager();
        SupportMapFragment supportMapFragment = (SupportMapFragment) fragmentManager.findFragmentById(R.id.map);
        supportMapFragment.getMapAsync(mapsActivity);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.parada_letras:
                mapsActivity.setMark(new Marcador("Primeira Parada", Coordenadas.COORDENADA_PARADA_1));
                break;
            case R.id.parada_biologia:
                mapsActivity.setMark(new Marcador("Segunda Parada", Coordenadas.COORDENADA_PARADA_2));
                break;
            case R.id.parada_escola:
                mapsActivity.setMark(new Marcador("Terceira Parada", Coordenadas.COORDENADA_PARADA_3));
                break;
            case R.id.parada_reitoria:
                mapsActivity.setMark(new Marcador("Quarta Parada", Coordenadas.COORDENADA_PARADA_4));
                break;
            case R.id.parada_uemanet:
                mapsActivity.setMark(new Marcador("Quinta Parada", Coordenadas.COORDENADA_PARADA_5));
                break;
            case R.id.parada_vet_ru:
                mapsActivity.setMark(new Marcador("Sexta Parada", Coordenadas.COORDENADA_PARADA_6));
                break;
            case R.id.parada_ponto_final:
                mapsActivity.setMark(new Marcador("Ponto Final", Coordenadas.COORDENADA_PARADA_FINAL));
                break;
            case R.id.predio_letras:
                mapsActivity.setMark(new Marcador("Prédio de Letras", Coordenadas.COORDENADA_PREDIO_LETRAS));
                break;
            case R.id.predio_geografia:
                mapsActivity.setMark(new Marcador("Prédio de Geografia", Coordenadas.COORDENADA_PREDIO_GEOGRAFIA));
                break;
            case R.id.predio_biologia:
                mapsActivity.setMark(new Marcador("Prédio de Biologia", Coordenadas.COORDENADA_PREDIO_BIOLOGIA));
                break;
            case R.id.predio_cct:
                mapsActivity.setMark(new Marcador("Prédio CCT", Coordenadas.COORDENADA_PREDIO_CCT));
                break;
            case R.id.predio_biblioteca:
                mapsActivity.setMark(new Marcador("Biblioteca", Coordenadas.COORDENADA_PREDIO_BIBLIOTECA));
                break;
            case R.id.predio_restaurante:
                mapsActivity.setMark(new Marcador("Restaurante Universitário", Coordenadas.COORDENADA_PREDIO_RESTAURANTE));
                break;
            case R.id.predio_prog:
                mapsActivity.setMark(new Marcador("Pró-Reitoria de Grad.", Coordenadas.COORDENADA_PREDIO_PROG));
                break;
            case R.id.predio_proplan:
                mapsActivity.setMark(new Marcador("Pró-Reitoria de Planej", Coordenadas.COORDENADA_PREDIO_PROPLAN));
                break;


        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
