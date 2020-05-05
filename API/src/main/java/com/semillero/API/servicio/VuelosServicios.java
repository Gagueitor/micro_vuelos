package com.semillero.API.servicio;

import com.semillero.API.interfecaService.IvuelosService;
import com.semillero.API.modelo.Vuelos;

import java.util.List;
import java.util.Optional;

public class VuelosServicios implements IvuelosService {

    @Override
    public List<Vuelos> Consultar() {
        return null;
    }

    @Override
    public Optional<Vuelos> ConsultarId(int id) {
        return Optional.empty();
    }
}
