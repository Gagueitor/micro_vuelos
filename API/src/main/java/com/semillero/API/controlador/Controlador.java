package com.semillero.API.controlador;

import com.semillero.API.interfecaService.IvuelosService;
import com.semillero.API.modelo.Vuelos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IvuelosService service;
    @GetMapping("/Consultar")
    public String Consultar(Model model){
        List<Vuelos>vuelos=service.Consultar();
        model.addAttribute("vuelos", vuelos);
        return "index";
    }
}
