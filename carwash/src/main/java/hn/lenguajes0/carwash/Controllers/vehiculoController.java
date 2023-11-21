package hn.lenguajes0.carwash.Controllers;

import jakarta.persistence.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import hn.lenguajes0.carwash.modelos.cliente;
import hn.lenguajes0.carwash.modelos.vehiculo;
import hn.lenguajes0.carwash.servicios.Impl.vehiculoServiceImpl;

@Entity
@RequestMapping("/api/vehiculo")
public class vehiculoController {

    @Autowired
    private vehiculoServiceImpl vehiculoServiceImpl;

     @PostMapping("/crear")
public vehiculo crearVehiculo(@RequestBody vehiculo nuevo) {     
    return this.vehiculoServiceImpl.crearCliente(nuevo);



}

@GetMapping("/obtener/todos")
    public List<vehiculo> obtenerTodos(){
        return this.vehiculoServiceImpl.obtenerTodosVehiculos();
    }
    
}
