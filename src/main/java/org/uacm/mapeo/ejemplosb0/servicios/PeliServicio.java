package org.uacm.mapeo.ejemplosb0.servicios;

import org.uacm.mapeo.ejemplosb0.persistencia.entidades.Pelicula;

import java.util.List;

public interface PeliServicio {

    List<Pelicula> consultarPeliculas();
    List<Pelicula> consultaPeliDurancionEntre(float d1,float d2);
}
