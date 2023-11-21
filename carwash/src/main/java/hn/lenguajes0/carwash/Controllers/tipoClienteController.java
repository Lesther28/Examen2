package hn.lenguajes0.carwash.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes0.carwash.modelos.tipocliente;
import hn.lenguajes0.carwash.servicios.Impl.tipoclienteServiceImpl;

@RestController
@RequestMapping("/api/tipoclientes")
public class tipoClienteController {

    @Autowired
    private tipoclienteServiceImpl tipoclienteServiceImpl;

    @PostMapping("/crear")
    public tipocliente creartipocliente(@RequestParam String descripcion,@RequestBody tipocliente nvotipocliente){     
        

        return this.tipoclienteServiceImpl.creartipocliente(descripcion, nvotipocliente);
    } 
    
}
