package hn.lenguajes0.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes0.carwash.modelos.tipovehiculo;


public interface tipoVehiculoRepository extends JpaRepository<tipovehiculo, Integer> {
    
}
