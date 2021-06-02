package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import edu.utp.chamcha.model.*;

@Controller
public class DetallePedidoContoller {
    
 private static final String  VIEW_DetallePedido="Cliente/detalle-pedido" ;
 @GetMapping("/cliente/detalle-pedido")
 public String index(Model model) {
     return VIEW_DetallePedido;
 }   
 
}
