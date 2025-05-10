package org.lessons.java.oop.snack3;

import org.lessons.java.oop.snack1.Studente;

// % Utilizza un array privato per memorizzare oggetti Studente. 
//  % Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro.
// % Aggiungi un metodo che stampi la lista degli studenti.

public class RegistroStudenti{
    private Studente[] studenti;

    public RegistroStudenti(){
        this.studenti = new Studente[0]; 
    }

    public void aggiungiStudente(Studente nuovoStudente){
        // # creare un nuovo array lungo come quello di prima + 1
        Studente[] registroAggiornato = new Studente[this.studenti.length + 1];
        
        for (int i = 0; i < this.studenti.length ; i++) {
            registroAggiornato[i] = this.studenti[i];
        }

        registroAggiornato[registroAggiornato.length - 1] = nuovoStudente;
        this.studenti = registroAggiornato;
    }

    public String scriviStudenti(){
        String listaInStringa = "Studenti: ";

        for (Studente studente : this.studenti) {
            listaInStringa += " " + studente.getInfoStudente();
        }

        return listaInStringa;
    }

}