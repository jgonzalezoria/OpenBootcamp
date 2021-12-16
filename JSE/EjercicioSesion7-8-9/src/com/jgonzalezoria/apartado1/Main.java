package com.jgonzalezoria.apartado1;

/**
 * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 */

public class Main {

    public static void main(String[] args) {

        String[] nombres = {"Jose Alberto", "Juan", "Pepe", "Victor", "Alex", "Jesus"};

        for(String nombre:nombres){
            System.out.println(nombre);
        }

    }
}
