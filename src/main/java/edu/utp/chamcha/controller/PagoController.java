package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagoController {
    public static String PAGO="cliente/pagar";
    @GetMapping("/cliente/pagar")
    public String index(Model model) {
        return PAGO;
    } 
}
