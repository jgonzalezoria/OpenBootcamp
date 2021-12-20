package com.jgonzalezoria;

import org.springframework.stereotype.Component;

@Component
public class Saludo {

    public Saludo(){

    }

    public String imprimirSaludo(){
        return "Hola estás viendo el saludo desde Saludo";
    }
}
