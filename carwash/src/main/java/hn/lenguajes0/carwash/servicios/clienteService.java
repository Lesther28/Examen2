package hn.lenguajes0.carwash.servicios;

import java.util.List;

import hn.lenguajes0.carwash.modelos.cliente;

public interface clienteService {
    cliente crearCliente(cliente nvocliente);

    public List<cliente> obtenerTodosCliente();
}
