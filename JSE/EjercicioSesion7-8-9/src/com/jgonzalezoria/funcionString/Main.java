package com.jgonzalezoria.funcionString;

import java.util.Scanner;

/**
 * Dada la función:
 *
 * public static String reverse(String texto) {
 *
 * }
 * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
 */

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String texto, reverseTexto;

        System.out.println("Dime un texto para ponerlo al revés: ");
        texto = teclado.nextLine();

        reverseTexto = reverse(texto);

        System.out.println(reverseTexto);


    }

    public static String reverse(String texto){
        String reverseTexto = "";

        for(int i = (texto.length()-1);i>=0;i--){
            reverseTexto += texto.charAt(i);
        }

        return reverseTexto;
    }


}
