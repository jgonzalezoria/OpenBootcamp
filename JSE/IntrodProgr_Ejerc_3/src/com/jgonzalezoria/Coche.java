package com.jgonzalezoria;

public class Coche {

    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int aniadirPuertas(int num){
        int puertasTotales = this.numPuertas + num;
        this.setNumPuertas(puertasTotales);
        return this.getNumPuertas();
    }
}
