package poo.clases;

public class SmartDevice {

    // atributos
    String fabricante;
    String modelo;
    double tamanoPantalla;
    int duracionBateria;
    int almacenamiento;
    int brilloPantalla;

    // constructores
    public SmartDevice(){

    }

    public SmartDevice(String fabricante, String modelo, double tamanoPantalla, int duracionBateria, int almacenamiento, int brilloPantalla) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tamanoPantalla = tamanoPantalla;
        this.duracionBateria = duracionBateria;
        this.almacenamiento = almacenamiento;
        this.brilloPantalla = brilloPantalla;
    }

    // métodos
    public int aumentarBrillo(int brilloPantalla){
        return this.brilloPantalla = brilloPantalla;
    }

    // toString


    @Override
    public String toString() {
        return "SmartDevice{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanoPantalla=" + tamanoPantalla +
                ", duracionBateria=" + duracionBateria +
                ", almacenamiento=" + almacenamiento +
                ", brilloPantalla=" + brilloPantalla +
                '}';
    }
}
