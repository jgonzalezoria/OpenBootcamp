package com.jgonzalezoria;

public class Cliente extends Persona{

    private double credito;

    public Cliente(String nombre, int edad, String telefono, double credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
