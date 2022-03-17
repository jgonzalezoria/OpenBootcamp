package com.jgonzalezoria;

public class Uso_Persona {

    public static void main(String[] args){

        Persona person = new Persona("Jose", 40, "679842631");

        System.out.println("Nombre: " + person.getNombre() + ", con una edad de " + person.getEdad() + " y un teléfono número " +
                person.getTelefono());

        person.setNombre("José Alberto");
        person.setEdad(43);
        person.setTelefono("694581352");

        System.out.println("Mostramos a la persona con los datos modificados.");

        System.out.println("Nombre: " + person.getNombre() + ", con una edad de " + person.getEdad() + " y un teléfono número " +
                person.getTelefono());
    }

}
