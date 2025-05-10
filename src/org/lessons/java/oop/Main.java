package org.lessons.java.oop;

public class Main {
    public static void main(String[] args) {
        Automobile ferrarina = new Automobile("Rosso", "Ferrari", 2002, 500);
        // ferrarina.colore = "        ";
        ferrarina.setColore("");

        // ferrarina.setMarca("lamborghini");
        Automobile pandino = new Automobile("Bianco", "Fiat", 1994);

        System.out.println(pandino.accendi());
        System.out.println(ferrarina.accendi());
    }


}
