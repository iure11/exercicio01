package com.iure.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.iure.demo.model.Pessoa;

@Controller
public class HomeController {

    @GetMapping("home")
    public String home(Model model){
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Edson");
        pessoa.setSobreNome("Angoti");
        System.out.println("-----------------------> "+ pessoa.getSobreNome());
        
        model.addAttribute("p", pessoa);
        
        return "index";
    }
    
}
