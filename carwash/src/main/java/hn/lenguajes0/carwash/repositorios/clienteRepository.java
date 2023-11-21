package hn.lenguajes0.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes0.carwash.modelos.cliente;


public interface clienteRepository extends JpaRepository<cliente,Integer> {
    
}
