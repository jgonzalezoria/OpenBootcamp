package poo.herencia;

import poo.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    // atributos
    boolean resistente;
    boolean podometro;

    // constructores
    public SmartWatch(){

    }

    public SmartWatch(String fabricante, String modelo, double tamanoPantalla, int duracionBateria, int almacenamiento,
                      int brilloPantalla, boolean resistente, boolean podometro) {
        super(fabricante, modelo, tamanoPantalla, duracionBateria, almacenamiento, brilloPantalla);
        this.resistente = resistente;
        this.podometro = podometro;
    }

    // toString

    @Override
    public String toString() {
        return "SmartWatch{" +
                "resistente=" + resistente +
                ", podometro=" + podometro +
                "} " + super.toString();
    }
}
