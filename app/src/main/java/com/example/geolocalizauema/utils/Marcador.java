package com.example.geolocalizauema.utils;

import com.google.android.gms.maps.model.LatLng;

public class Marcador {

    private String titulo;
    private LatLng coordenada;

    public Marcador(String titulo, LatLng coordenada) {
        this.titulo = titulo;
        this.coordenada = coordenada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LatLng getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(LatLng coordenada) {
        this.coordenada = coordenada;
    }
}
