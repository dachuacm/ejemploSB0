package org.uacm.mapeo.ejemplosb0.servicios;

import org.uacm.mapeo.ejemplosb0.persistencia.entidades.Funcion;

import java.util.List;

public interface FuncionServicio {

    Funcion programarFuncion(Funcion f);
    List<Funcion> consultarFunciones();

}
