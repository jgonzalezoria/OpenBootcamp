package com.jgonzalezoria.apartado2;

import java.util.Scanner;

/**
 * Crea un array bidimensional de enteros y recórrelo,
 * mostrando la posición y el valor de cada elemento en ambas dimensiones.
 */

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int filas, columnas;

        // pedimos el número de filas y columnas del array
        System.out.print("Dime el número de filas del array: ");
        filas = teclado.nextInt();
        System.out.print("Dime el número de columnas del array: ");
        columnas = teclado.nextInt();

        // creamos el array bidimensional con las filas y columnas pediddas por teclado
        int numeros[][] = new int[filas][columnas];

        // introducimos por teclado los números del array
        System.out.println("Introduce los números del array: ");
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                System.out.print("Número [" + i + "][" + j +"]: ");
                numeros[i][j] = teclado.nextInt();
            }
        }

        System.out.println();

        // mostramos por pantalla el array creado
        System.out.println("El array es: ");
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                System.out.println("Número [" + i + "][" + j +"]: " + numeros[i][j]);
            }
        }

    }
}
