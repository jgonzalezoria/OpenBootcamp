package com.jgonzalezoria.apartado3;

import java.util.Vector;

/**
 * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
 * Elimina el 2o y 3er elemento y muestra el resultado final.
 */

public class Main {

    public static void main(String[] args) {


        // creamos el vector de String
        Vector<String> nombres = new Vector<>();
        nombres.add("Jose Alberto");
        nombres.add("Alex");
        nombres.add("Jesus");
        nombres.add("Diego");
        nombres.add("Tania");

        System.out.println(nombres);

        // eliminamos los elementos segundo y tercero
        nombres.remove("Alex");
        // Al haber eliminado el segundo elemento, el tercero pasa a ser el segundo, por lo que se elimina el segundo dos veces
        nombres.remove(1);
        System.out.println(nombres);

    }
}
