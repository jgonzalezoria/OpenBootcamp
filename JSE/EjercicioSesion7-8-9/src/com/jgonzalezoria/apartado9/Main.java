package com.jgonzalezoria.apartado9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Sorpréndenos creando un programa de tu elección que utilice InputStream,
 * PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 */

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> datosPersonas = new HashMap<>();
        datosPersonas.put("Jose", "12345678A");
        datosPersonas.put("Alex", "87654321B");
        datosPersonas.put("Jesus", "45678123C");
        datosPersonas.put("Diego", "12378456D");

        ArrayList<String> propiedadesPersonas = new ArrayList<>();
        propiedadesPersonas.add("Casa");
        propiedadesPersonas.add("Trabajo");
        propiedadesPersonas.add("Coche");
        propiedadesPersonas.add("Moto");

        try{
            PrintStream outFileIn = new PrintStream("D:\\jgonzalezoria\\Workspace\\Intellij\\OpenBootcamp\\Proyectos\\JSE\\EjercicioSesion7-8-9\\src\\com\\jgonzalezoria\\apartado9\\ficheros\\datosPersonas");
            Iterator<String> it = datosPersonas.keySet().iterator();
            int cont = 0;
            while (it.hasNext()) {
                String clave = it.next();
                String valor = datosPersonas.get(clave);
                outFileIn.println(clave + " " + valor);
                outFileIn.println(propiedadesPersonas.get(cont));
                cont++;
            }
            outFileIn.close();
        } catch (Exception e){
            System.out.println("No se pudo escribir en el archivo." + e.getMessage());
        }

        try {
            InputStream inFileOut = new FileInputStream("D:\\jgonzalezoria\\Workspace\\Intellij\\OpenBootcamp\\Proyectos\\JSE\\EjercicioSesion7-8-9\\src\\com\\jgonzalezoria\\apartado9\\ficheros\\datosPersonas");
            byte[] datos = inFileOut.readAllBytes();
            System.out.println("Mostramos el contenido del fichero: ");
            for(byte dato: datos){
                System.out.print((char)dato);
            }
            inFileOut.close();
        } catch (Exception e){
            System.out.println("No se pudo leer en el archivo." + e.getMessage());
        }

    }
}
