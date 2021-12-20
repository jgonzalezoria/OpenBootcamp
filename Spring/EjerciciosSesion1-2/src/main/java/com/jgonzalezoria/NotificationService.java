package com.jgonzalezoria;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){

    }

    public String imprimirSaludo(){
        return "Hola, estás viendo el saludo desde NotificationService";
    }
}
