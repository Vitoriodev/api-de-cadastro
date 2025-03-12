package com.vitoriodev.cadastro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem-vindo ao sistema de cadastro";
    }
}
