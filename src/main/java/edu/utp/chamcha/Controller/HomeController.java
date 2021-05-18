package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    private static final String HOME_INDEX = "welcome";

    @GetMapping("/")
    public String index(){
        return HOME_INDEX;
    }
}
