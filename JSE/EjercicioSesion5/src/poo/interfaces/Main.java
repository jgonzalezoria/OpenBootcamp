package poo.interfaces;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        Coche porscheCoche = new Coche("Porsche", "718 Spyder", 3.995, 420);
        Coche ferrariCoche = new Coche("Ferrari", "SF90 Stradale", 3990, 195);
        Coche lamboghiniCoche = new Coche("Lamborghini", "Huracan Evo Spyder", 5204, 640);

        cocheCRUD.save(porscheCoche);
        cocheCRUD.save(ferrariCoche);
        cocheCRUD.save(lamboghiniCoche);

        System.out.println(cocheCRUD.findAll());

        cocheCRUD.delete(ferrariCoche);

        System.out.println(cocheCRUD.findAll());


    }
}
