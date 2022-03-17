package com.jgonzalezoria;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioTema4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Usando la estructura If");
        int numeroIf;
        System.out.print("Dime un numero: ");
        numeroIf = teclado.nextInt();
        if(numeroIf<0){
            System.out.println("El número " + numeroIf + " es negativo");
        }
        else if(numeroIf>0){
            System.out.println("El número " + numeroIf + " es positivo");
        }
        else{
            System.out.println("El número " + numeroIf + " es cero");
        }
        teclado.nextLine();
        System.out.println("Usando la estructura While");
        int numeroWhile = 0;
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println("El numeroWhile es: "+ numeroWhile);
        }

        System.out.println("Usando la estructura Do While");
        do{
            numeroWhile=2;
            numeroWhile++;
            System.out.println("El numeroWhile es: "+ numeroWhile);
        }while(numeroWhile<3);

        System.out.println("Usando la estructura For");
        int numeroFor=0;
        for(int i=0;i<3;i++){
            numeroFor++;
            System.out.println("El numeroFor es: " + numeroFor);
        }

        System.out.println("Usando la estructura Switch");
        String estacion;
        System.out.print("Dime en la estacion que estamos: ");
        estacion = teclado.nextLine();
        estacion = estacion.toUpperCase();
        switch(estacion){
            case "PRIMAVERA":
                System.out.println("Estamos en " + estacion);
                break;
            case "VERANO":
                System.out.println("Estamos en " + estacion);
                break;
            case "OTOÑO":
                System.out.println("Estamos en " + estacion);
                break;
            case "INVIERNO":
                System.out.println("Estamos en " + estacion);
                break;
            default:
                System.out.println("Esa estación no existe");
                break;
        }

    }
}
