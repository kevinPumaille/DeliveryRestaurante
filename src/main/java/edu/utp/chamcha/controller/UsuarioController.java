package edu.utp.chamcha.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.utp.chamcha.model.Usuario;
import edu.utp.chamcha.repository.UsuarioRepository;

@Controller
public class UsuarioController {

    private static final String INDEX ="usuario/login"; 
    private static String MODEL_CONTACT="user";
    private static String MODEL_MESSAGE="mensaje";
    private final UsuarioRepository usuariosData;
    
    
    
    public UsuarioController(UsuarioRepository usuariosData){
        this.usuariosData = usuariosData;
    }
    
    
    
    
    @GetMapping("/usuario/login")
    public String loginUser(Model model){
        model.addAttribute(MODEL_CONTACT,new Usuario());
        return INDEX;
    }
    
    @PostMapping("/usuario/login")
    public String loginSubmitForm(Model model, @Valid Usuario objUser,BindingResult result){
        String page = INDEX;
        model.addAttribute(MODEL_CONTACT, new Usuario());        
        if(result.hasFieldErrors()) {
            model.addAttribute(MODEL_MESSAGE, "No se ha podido loguear");
        }else{
            Optional<Usuario> userDB = this.usuariosData.findById(objUser.getEmail());
            if(userDB.isPresent()){
                if(userDB.get().getPassword().equals(objUser.getPassword())){
                    model.addAttribute(MODEL_CONTACT,userDB.get());
                    model.addAttribute(MODEL_MESSAGE, "Usuario existe");
                    page="cliente/Menu_Carta";  
                }else{
                    model.addAttribute(MODEL_MESSAGE, "Password no coincide");  
                }
            }else{
                model.addAttribute(MODEL_MESSAGE, "Usuario no existe");
            }
        }
        return page;
    }
    
    

}

