package org.lessons.java.oop.snack3;

import org.lessons.java.oop.snack1.Studente;

public class Main {
    public static void main(String[] args) {
        
        Studente gina = new Studente("Gina", "Ginuzzi", 26);
        Studente ginetta = new Studente("Ginetta", "Bianchi", 35);
        Studente gino = new Studente("Gino", "Ginetti", 33);
        RegistroStudenti registro = new RegistroStudenti();
        registro.aggiungiStudente(gina); 
        registro.aggiungiStudente(gino);
        registro.aggiungiStudente(ginetta);
        System.out.println(registro.scriviStudenti());
    } 
}
