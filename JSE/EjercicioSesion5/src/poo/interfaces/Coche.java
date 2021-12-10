package poo.interfaces;

public class Coche {

    // atributos
    String fabricante;
    String modelo;
    double cc;
    int potencia;

    // constructores
    public Coche(){

    }

    public Coche(String fabricante, String modelo, double cc, int potencia) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.potencia = potencia;
    }

    // métodos


    @Override
    public String toString() {
        return "Coche{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cc=" + cc +
                ", potencia=" + potencia +
                '}';
    }
}
