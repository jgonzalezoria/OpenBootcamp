package com.jgonzalezoria.apartado4;

import java.util.Vector;

/**
 * Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
 * si tuviésemos 1000 elementos para ser añadidos al mismo.
 */

public class Main {

    public static void main(String[] args) {

        Vector<Integer> numeros = new Vector<>();
        int tam = 1000;
        int num;

        for(int i=0;i<1000;i++){
            num = (int)(Math.random()*1000+1);
            numeros.add(num);
            if(i%10==0){
                System.out.println("Capacidad: " + numeros.capacity() + " Tamaño: " + numeros.size());
            }
        }

        System.out.println(numeros);

        System.out.println("Respuesta del apartado: ");
        System.out.println("El vector va aumentando de capacidad a medida que lo requiere el tamaño del mismo \n" +
                "por lo que cada vez que aumenta esa capacidad hace un duplicado del vector usando más memoria \n" +
                "y haciendo trabajar al procesador.");

    }
}
