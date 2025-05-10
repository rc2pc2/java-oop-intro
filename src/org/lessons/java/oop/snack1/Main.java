package org.lessons.java.oop.snack1;

public class Main {
    public static void main(String[] args) {
        Studente gina = new Studente("Gina", "Ginuzzi", 26);
        Studente gino = new Studente("Gino", "Ginetti", 33);
    
        System.out.println(gina.getInfoStudente());
        System.out.println(gino.getInfoStudente());
    }
}
