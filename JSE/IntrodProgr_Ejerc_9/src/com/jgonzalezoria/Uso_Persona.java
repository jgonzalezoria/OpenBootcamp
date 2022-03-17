package com.jgonzalezoria;

public class Uso_Persona {

    public static void main(String[] args){

        Cliente cli = new Cliente("Pedro", 35, "873429874", 2500);

        System.out.println("Nombre: " + cli.getNombre() + ", con una edad de " + cli.getEdad() + ", un teléfono número " +
                cli.getTelefono() + " y tiene un crédito de " + cli.getCredito());

        cli.setNombre("Pedrito");
        cli.setEdad(38);
        cli.setTelefono("694581352");
        cli.setCredito(2250);

        System.out.println("Mostramos a la persona con los datos modificados del cliente.");

        System.out.println("Nombre: " + cli.getNombre() + ", con una edad de " + cli.getEdad() + ", un teléfono número " +
                cli.getTelefono() + " y tiene un crédito de " + cli.getCredito());

        Trabajador trab = new Trabajador("Ant", 27, "847239855", 950);

        System.out.println("Nombre: " + trab.getNombre() + ", con una edad de " + trab.getEdad() + ", un teléfono número " +
                trab.getTelefono() + " y tiene un salario de " + trab.getSalario());

        trab.setNombre("Antonio");
        trab.setEdad(30);
        trab.setTelefono("573428922");
        trab.setSalario(1100);

        System.out.println("Mostramos a la persona con los datos modificados del trabajador.");

        System.out.println("Nombre: " + trab.getNombre() + ", con una edad de " + trab.getEdad() + ", un teléfono número " +
                trab.getTelefono() + " y tiene un salario de " + trab.getSalario());

    }
}
