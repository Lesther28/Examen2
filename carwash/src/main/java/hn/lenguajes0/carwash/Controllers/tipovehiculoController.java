package hn.lenguajes0.carwash.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes0.carwash.modelos.tipovehiculo;
import hn.lenguajes0.carwash.servicios.tipovehivulo;
import hn.lenguajes0.carwash.servicios.Impl.tipovehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipovehiculos")
public class tipovehiculoController {

     @Autowired
    private tipovehiculoServiceImpl tipovehiculoServiceImpl;

    @PostMapping("/crear")
    public tipovehivulo creartipovehiculo(@RequestBody tipovehiculo nvoTipo){     


        return this.tipovehiculoServiceImpl.creartipovehiculo(nvoTipo);
    }   
}
