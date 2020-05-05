package com.semillero.API.interfaces;

import com.semillero.API.modelo.Vuelos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ivuelos extends CrudRepository<Vuelos, Integer> {
}
