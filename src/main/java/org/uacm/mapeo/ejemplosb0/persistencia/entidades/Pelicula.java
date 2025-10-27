package org.uacm.mapeo.ejemplosb0.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="peliculas")
@Setter
@Getter
@ToString
@NamedQuery(name = "selectPeliculaTitulo", query = "SELECT p FROM Pelicula p WHERE p.titulo=:titulo")
    public class Pelicula
    {
        @ToString.Exclude
        @Id
        @Column(name="id_pelicula")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String titulo;

        @Column(name="genero")
        private String tipo;

        private float duracion;


}
