package com.jgonzalezoria.apartado8;

import java.io.*;
import java.util.Scanner;

/**
 * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
 */

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /*
        File origen = new File("D:\\jgonzalezoria\\Workspace\\Intellij\\OpenBootcamp\\Proyectos\\JSE\\EjercicioSesion7-8-9\\src\\com\\jgonzalezoria\\apartado8\\ficheros\\fileIn");
        File destino = new File("D:\\jgonzalezoria\\Workspace\\Intellij\\OpenBootcamp\\Proyectos\\JSE\\EjercicioSesion7-8-9\\src\\com\\jgonzalezoria\\apartado8\\ficheros\\fileOut");

        try {
            origen.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("No se pudo crear el archivo" + e.getMessage());
        }

        try {
            destino.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("No se pudo crear el archivo" + e.getMessage());
        }
        */
        String texto;
        System.out.println("Introduce el texto que quieres escribir en el archivo fileIn: ");
        texto = teclado.nextLine();
        try{
            PrintStream outFileIn = new PrintStream("D:\\jgonzalezoria\\Workspace\\Intellij\\OpenBootcamp\\Proyectos\\JSE\\EjercicioSesion7-8-9\\src\\com\\jgonzalezoria\\apartado8\\ficheros\\fileIn");
            outFileIn.println(texto);
            outFileIn.close();
        } catch (Exception e){
            System.out.println("No se pudo escribir en el archivo." + e.getMessage());
        }

        try {
            InputStream inFileIn = new FileInputStream("D:\\jgonzalezoria\\Workspace\\Intellij\\OpenBootcamp\\Proyectos\\JSE\\EjercicioSesion7-8-9\\src\\com\\jgonzalezoria\\apartado8\\ficheros\\fileIn");
            byte[] datos = inFileIn.readAllBytes();
            System.out.println("Mostramos el contenido del fichero origen: ");
            for(byte dato: datos){
                System.out.print((char)dato);
            }
            inFileIn.close();

            PrintStream outFileOut = new PrintStream("D:\\jgonzalezoria\\Workspace\\Intellij\\OpenBootcamp\\Proyectos\\JSE\\EjercicioSesion7-8-9\\src\\com\\jgonzalezoria\\apartado8\\ficheros\\fileOut");
            outFileOut.write(datos);
            outFileOut.close();
        } catch (Exception e){
            System.out.println("No se pudo escribir en el archivo." + e.getMessage());
        }

        try {
            InputStream inFileOut = new FileInputStream("D:\\jgonzalezoria\\Workspace\\Intellij\\OpenBootcamp\\Proyectos\\JSE\\EjercicioSesion7-8-9\\src\\com\\jgonzalezoria\\apartado8\\ficheros\\fileOut");
            byte[] datos = inFileOut.readAllBytes();
            System.out.println("Mostramos el contenido del fichero destino: ");
            for(byte dato: datos){
                System.out.print((char)dato);
            }
            inFileOut.close();
        } catch (Exception e){
            System.out.println("No se pudo leer en el archivo." + e.getMessage());
        }


    }
}
