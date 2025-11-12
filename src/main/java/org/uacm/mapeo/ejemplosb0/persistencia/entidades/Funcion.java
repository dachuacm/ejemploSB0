package org.uacm.mapeo.ejemplosb0.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="funciones")
public class Funcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Exclude
    private int id;

    @ManyToOne
    @JoinColumn(name = "p_id_pelicula")
    private Pelicula p;

    @ManyToOne
    @JoinColumn(name = "s_id")
    private Sala s;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horario;

    @Temporal(TemporalType.DATE)
    private LocalDate fecha;

}
