package org.uacm.mapeo.ejemplosb0;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.uacm.mapeo.ejemplosb0.persistencia.entidades.Funcion;
import org.uacm.mapeo.ejemplosb0.persistencia.entidades.Pelicula;
import org.uacm.mapeo.ejemplosb0.persistencia.entidades.Sala;
import org.uacm.mapeo.ejemplosb0.servicios.FuncionServicio;
import org.uacm.mapeo.ejemplosb0.servicios.PeliServicio;
import org.uacm.mapeo.ejemplosb0.servicios.SalaServicio;

import java.util.List;

@Controller
public class ControladorFunciones {
    @Autowired
    SalaServicio servicioS;

    @Autowired
    PeliServicio servicioP;
    @Autowired
    FuncionServicio servicioF;


    @PostMapping("/formularioF")
    public String checkFormulario(@Valid Sala sala, BindingResult bres){

        if(bres.hasErrors()){
            System.out.println(sala);
            return "formulario_salas";
        }
        //servicio.agregaSala(sala);
        return "redirect:/";
    }

    @GetMapping("/formularioF")
    public String mostrarForumulario(Funcion funcion, Model model){
        List<Sala> salas=servicioS.consultaSalas();
        model.addAttribute("salas",salas);
        List<Pelicula> peliculas=servicioP.consultarPeliculas();
        model.addAttribute("peliculas",peliculas);

        return "formulario_funciones";
    }
}
