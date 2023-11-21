package hn.lenguajes0.carwash.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.lenguajes0.carwash.modelos.vehiculo;
import hn.lenguajes0.carwash.repositorios.vehiculoRepository;
import hn.lenguajes0.carwash.servicios.vehiculoService;

public class vehiculoServiceImpl implements vehiculoService {

    @Autowired
    private vehiculoRepository vehiculoRepository;
    @Override
    public vehiculo crearCliente(vehiculo nuevo) {
        return vehiculoRepository.save(nuevo);
    }
    
}
