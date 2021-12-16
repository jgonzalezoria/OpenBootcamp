package com.jgonzalezoria.apartado7;

import java.util.Scanner;

/**
 * Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante
 * del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente,
 * mostraremos en cualquier caso: "Demo de código".
 */

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a, b;
        System.out.print("Introduce un número: ");
        a = teclado.nextInt();
        System.out.print("Introduce otro número: ");
        b = teclado.nextInt();

        try {
            dividePorCero(a,b);
        } catch (ArithmeticException e){
            System.out.println("No puedes dividir un número entre 0");
        } finally {
            System.out.println("Demo de código");
        }

    }

    public static int dividePorCero(int a, int b) throws ArithmeticException{
        int resultado;
        resultado = a/b;
        if(b==0){
            throw new ArithmeticException();
        }
        return resultado;
    }

}
