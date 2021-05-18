package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/usuario/login")
    public String login(){
        return "NoCliente/inicioSesion";
    }
}
