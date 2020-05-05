package com.semillero.API.interfecaService;

import com.semillero.API.modelo.Vuelos;

import java.util.List;
import java.util.Optional;

public interface IvuelosService {
    //Creamos los metodos
    public List<Vuelos>Consultar();
    public Optional<Vuelos>ConsultarId(int id);
    //Aqui metodo para borrar y guardar
}
