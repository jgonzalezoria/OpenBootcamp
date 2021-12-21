package com.jgonzalezoria.EjercicioSesion456.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloController")
    public String holaMundo(){
        return "Buenas a todos, te saludo desde HelloController";
    }

}
