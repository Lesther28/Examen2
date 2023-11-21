package hn.lenguajes0.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes0.carwash.modelos.tipocliente;


public interface tipoClienteRepository extends JpaRepository<tipocliente,Integer> {
    
}
