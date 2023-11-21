package hn.lenguajes0.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes0.carwash.modelos.reserva;


public interface reservaRepository extends JpaRepository<reserva,Integer>{
    
}
