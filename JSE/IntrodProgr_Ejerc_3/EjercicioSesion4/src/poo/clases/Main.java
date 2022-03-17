package poo.clases;

import poo.herencia.*;

public class Main {

    public static void main(String[] args) {

        SmartPhone applePhone = new SmartPhone("Apple", "X", 6.1, 8, 256, 60, 4, true);
        SmartPhone xiaomiPhone = new SmartPhone("Xiaomi", "MiA1", 6.0, 8, 64, 100, 2, true);

        SmartWatch appleWatch = new SmartWatch("Apple", "Seire 7", 2.0, 18, 0, 50, true, true);

        System.out.println(applePhone);
        System.out.println(appleWatch);
        System.out.println(xiaomiPhone);

    }
}
