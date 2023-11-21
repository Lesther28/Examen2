package hn.lenguajes0.carwash.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import hn.lenguajes0.carwash.modelos.cliente;
import jakarta.persistence.Entity;

@Entity
@RequestMapping("/api/cliente")
public class clienteController {
    

    @Autowired
    private clienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
public cliente crearCliente(@RequestBody cliente nuevoCliente) {     
    return this.clienteServiceImpl.crearCliente(nuevoCliente);


}  

@GetMapping("/obtener/todos")
    public List<cliente> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodosCliente();
    }


}
