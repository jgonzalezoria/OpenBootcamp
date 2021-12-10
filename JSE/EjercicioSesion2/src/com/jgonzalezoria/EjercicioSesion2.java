package com.jgonzalezoria;

/*
Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */

public class EjercicioSesion2 {

    public static void main(String[] args) {

        double precio = 100;

        double precioMasIva = precioIVA(precio);

        System.out.println(precioMasIva);

    }

    public static double precioIVA(double precio){
        return precio + precio * 0.21;
    }
}
