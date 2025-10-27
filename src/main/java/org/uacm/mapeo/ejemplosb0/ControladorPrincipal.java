package org.uacm.mapeo.ejemplosb0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uacm.mapeo.ejemplosb0.persistencia.entidades.Pelicula;
import org.uacm.mapeo.ejemplosb0.servicios.PeliServicio;

import java.util.List;

@Controller
public class ControladorPrincipal {

    @Autowired
    PeliServicio servicio;

    @RequestMapping( "/" )
    public String listarPeliculas (Model model) {
        List<Pelicula> datos=servicio.consultarPeliculas();
        model.addAttribute("listaPeli", datos);
        return "index";
    }
}
