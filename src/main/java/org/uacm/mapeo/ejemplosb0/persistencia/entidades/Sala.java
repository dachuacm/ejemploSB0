package org.uacm.mapeo.ejemplosb0.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="salas")
@Data
public class Sala {
    @ToString.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private int capcidad;
}
