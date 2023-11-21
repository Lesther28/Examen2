package hn.lenguajes0.carwash.servicios.Impl;

import java.util.List;

import hn.lenguajes0.carwash.modelos.cliente;
import hn.lenguajes0.carwash.modelos.tipovehiculo;
import hn.lenguajes0.carwash.modelos.vehiculo;
import hn.lenguajes0.carwash.servicios.tipovehiculoService;
import hn.lenguajes0.carwash.servicios.tipovehivulo;

public class tipovehiculoServiceImpl implements tipovehiculoService {

    @Override
    public tipovehivulo creartipovehiculo(tipovehiculo nvotipovehiculo) {

        return tipovehiculo.save(nvotipovehiculo);       
    }

    @Override
    public List<vehiculo> obtenerTodosVehiculos() {
        return this.vehiculoRepository.findAll();        
    }

    
}
