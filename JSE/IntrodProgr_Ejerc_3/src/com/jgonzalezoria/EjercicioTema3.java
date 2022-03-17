package com.jgonzalezoria;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioTema3 {

    public static void main(String[] args) {

        System.out.println("La suma de los números 5, 8 y 9 es: " + sumaNumeros(5,8,9));

        Coche coche = new Coche(3);
        System.out.println("El coche tiene ahora mismo " + coche.getNumPuertas() + " puertas");

        Scanner teclado = new Scanner(System.in).useLocale(Locale.UK);
        System.out.print("Dime cuantas puertas le quieres añadir al coche: ");
        int puertasNuevas = teclado.nextInt();
        coche.aniadirPuertas(puertasNuevas);

        System.out.println("El coche tiene ahora " + coche.getNumPuertas() + " después de añadirle " + puertasNuevas + " puertas");

    }
    public static int sumaNumeros(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}
