package com.jgonzalezoria;

public class Trabajador extends Persona{

    private double salario;

    public Trabajador(String nombre, int edad, String telefono, double salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
