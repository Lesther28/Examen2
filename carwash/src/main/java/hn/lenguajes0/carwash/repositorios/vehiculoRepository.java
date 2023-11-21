package hn.lenguajes0.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes0.carwash.modelos.vehiculo;


public interface vehiculoRepository extends JpaRepository<vehiculo, Integer> {
    
}
