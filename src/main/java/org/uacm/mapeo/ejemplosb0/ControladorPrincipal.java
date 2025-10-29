package org.uacm.mapeo.ejemplosb0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.uacm.mapeo.ejemplosb0.persistencia.entidades.Pelicula;
import org.uacm.mapeo.ejemplosb0.servicios.PeliServicio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ControladorPrincipal {

    @Autowired
    PeliServicio servicio;

    @RequestMapping( "/" )
    public String listarPeliculas (Model model) {
        List<Pelicula> datos=servicio.consultaPeliDurancionEntre(1.00f,1.30f);
        model.addAttribute("listaPeli", datos);
        return "index";
    }

    @RequestMapping( "/ejemploPag" )
    public String listarPeliculasPag (Model model, @RequestParam(defaultValue="0")int page,@RequestParam(defaultValue="5")int size) {
        Page<Pelicula> pagPeli;

        pagPeli=servicio.consultarPeliculasP(page,size);
        List<Pelicula> datos=pagPeli.getContent();

        Map<String,Object> respuesta=new HashMap<>();
        respuesta.put("peliculas",datos);
        respuesta.put("paginaActual",pagPeli.getNumber());
        respuesta.put("totalPeli",pagPeli.getTotalElements());
        respuesta.put("totalPag",pagPeli.getTotalPages());

        model.addAttribute("resultado", pagPeli);
        return "index";
    }
}












