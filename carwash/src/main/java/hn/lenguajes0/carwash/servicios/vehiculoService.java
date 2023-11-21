package hn.lenguajes0.carwash.servicios;


import java.util.List;

import hn.lenguajes0.carwash.modelos.vehiculo;

public interface vehiculoService {
    vehiculo crearCliente(vehiculo nuevo);

    public List<vehiculo> obtenerTodosVehiculos();
}
