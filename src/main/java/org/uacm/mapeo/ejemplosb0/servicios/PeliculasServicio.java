package org.uacm.mapeo.ejemplosb0.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uacm.mapeo.ejemplosb0.persistencia.entidades.Pelicula;
import org.uacm.mapeo.ejemplosb0.persistencia.repositorios.PeliculasRepo;

import java.util.List;

@Service
public class PeliculasServicio implements PeliServicio{
    @Autowired
    PeliculasRepo repo;

    @Override
    public List<Pelicula> consultarPeliculas() {
        return repo.findAll();
    }

    @Override
    public List<Pelicula> consultaPeliDurancionEntre(float d1, float d2) {
        return repo.findByDuracionBetween(d1,d2);
    }
}
