package org.lessons.java.oop.snack1;

// Snack 1: Studente 
// @ Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. Implementa un costruttore che accetti tre parametri per inizializzare questi attributi. Aggiungi un metodo che restituisca una stringa concatenata dei valori (es. Anselmo Bitta, 24 anni)

public class Studente {
    private String nome;
    private String cognome;
    private int eta;

    public Studente (String nome, String cognome, int eta ){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getInfoStudente(){
        return String.format("%s %s %d", this.nome, this.cognome, this.eta);
    }
}
