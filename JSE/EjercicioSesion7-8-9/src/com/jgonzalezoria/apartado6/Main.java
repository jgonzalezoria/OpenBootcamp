package com.jgonzalezoria.apartado6;

import java.util.ArrayList;

/**
 * Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
 * A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último,
 * vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos,
 * siempre y cuando cumplas el primer "for" de relleno.
 */

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i=0;i<10;i++){
            numeros.add(i+1);
        }
        System.out.println(numeros);
        for(int i=0;i<numeros.size();i++){
            if(numeros.get(i)%2==0){
                numeros.remove(numeros.get(i));
            }
        }
        for(Integer numero:numeros){
            System.out.print(numero + " ");
        }

        System.out.println("\nCreamos arraylist y eliminanos números pares al mismo tiempo.");
        ArrayList<Integer> numeros2 = new ArrayList<>();
        for(int i=0;i<10;i++){
            numeros2.add(i+1);
            for(int j=0;j< numeros2.size();j++){
                if(numeros2.get(j)%2==0){
                    numeros2.remove(numeros2.get(j));
                }
            }
        }
        System.out.println(numeros2);

    }
}
