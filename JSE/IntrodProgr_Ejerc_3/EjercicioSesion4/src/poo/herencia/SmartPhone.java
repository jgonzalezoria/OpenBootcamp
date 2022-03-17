package poo.herencia;

import poo.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    // atributos
    int numCamaras;
    boolean huellaDactilar;

    // constructores
    public SmartPhone(){

    }

    public SmartPhone(String fabricante, String modelo, double tamanoPantalla, int duracionBateria, int almacenamiento,
                      int brilloPantalla, int numCamaras, boolean huellaDactilar) {
        super(fabricante, modelo, tamanoPantalla, duracionBateria, almacenamiento, brilloPantalla);
        this.numCamaras = numCamaras;
        this.huellaDactilar = huellaDactilar;
    }

    // toString


    @Override
    public String toString() {
        return "SmartPhone{" +
                "numCamaras=" + numCamaras +
                ", huellaDactilar=" + huellaDactilar +
                "} " + super.toString();
    }
}
