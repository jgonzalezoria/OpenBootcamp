package com.jgonzalezoria.apartado5;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
 * Recorre ambos mostrando únicamente el valor de cada elemento.
 */

public class Main {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Jose Alberto");
        nombres.add("Alex");
        nombres.add("Jesus");
        nombres.add("Diego");

        LinkedList<String> copiaNombres = new LinkedList<>();

        for(int i=0;i<nombres.size();i++){
            copiaNombres.add(nombres.get(i));
        }
        System.out.println("ArrayList de tipo String: ");
        System.out.println(nombres);
        System.out.println("LinkedList copiado del ArrayList: ");
        System.out.println(copiaNombres);

    }
}
