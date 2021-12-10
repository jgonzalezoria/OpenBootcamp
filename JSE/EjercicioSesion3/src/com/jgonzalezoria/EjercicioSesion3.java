package com.jgonzalezoria;

/*
En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
Tened en cuenta que los textos pueden venir de un array de tipo String.
Por ejemplo: String[] nombres = {"", "", "", ""}
 */

public class EjercicioSesion3 {

    public static void main(String[] args) {

        String[] nombres = {"José Alberto", "está", "estudiando", "Java"};

        System.out.println("Concatenación con bucle for");
        for(int i = 0; i < nombres.length; i++){
            System.out.print(nombres[i] + " ");
        }

        System.out.println("\nConcatenación con bucle foreach");
        for(String nombre : nombres){
            System.out.print(nombre + " ");
        }

        System.out.println("\nConcatenación con bucle while");
        int contador = 0;
        while(contador < nombres.length){
            System.out.print(nombres[contador] + " ");
            contador++;
        }


    }
}
