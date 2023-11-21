package hn.lenguajes0.carwash.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.lenguajes0.carwash.modelos.tipocliente;
import hn.lenguajes0.carwash.repositorios.tipoClienteRepository;
import hn.lenguajes0.carwash.servicios.tipoclienteService;

public class tipoclienteServiceImpl implements tipoclienteService {

    @Autowired
    private tipoClienteRepository tipoClienteRepository;


    @Override
    public tipocliente creartipocliente(String descripcion, tipocliente nvotipocliente) {
        tipocliente nuevoTipo = new tipocliente();
        nuevoTipo.setDescripcion(descripcion);
    
    return tipoClienteRepository.save(nuevoTipo);
    }




    
}
    

