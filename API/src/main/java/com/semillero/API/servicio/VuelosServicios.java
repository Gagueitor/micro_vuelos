package com.semillero.API.servicio;

import com.semillero.API.interfaces.Ivuelos;
import com.semillero.API.interfecaService.IvuelosService;
import com.semillero.API.modelo.Vuelos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VuelosServicios implements IvuelosService {
    @Autowired
    private Ivuelos data; // nombre

    @Override
    public List<Vuelos> Consultar() {
        return (List<Vuelos>) data.findAll();
    }

    @Override
    public Optional<Vuelos> ConsultarId(int id) {
        return null;
    }
}
