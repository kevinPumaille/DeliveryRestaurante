package edu.utp.chamcha.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientCOntroller {
    
    @GetMapping("cliente/create")
    public String index(){
        return "NoCliente/crearCuenta";
    }
}
