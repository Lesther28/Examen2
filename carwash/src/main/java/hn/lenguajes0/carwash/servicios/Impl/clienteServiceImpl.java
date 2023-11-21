package hn.lenguajes0.carwash.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hn.lenguajes0.carwash.modelos.cliente;
import hn.lenguajes0.carwash.repositorios.clienteRepository;
import hn.lenguajes0.carwash.servicios.clienteService;

public class clienteServiceImpl implements clienteService {
    

    @Autowired
    private clienteRepository clienteRepository;

    @Override
    public cliente crearCliente(cliente nvocliente) {
        return clienteRepository.save(nvocliente);
    }

    @Override
    public List<cliente> obtenerTodosCliente() {
        return this.clienteRepository.findAll();        
    }

}
