package org.lessons.java.oop;

// # Crea un nuovo progetto per poter creare tutte le automobili che vorrai
public class Automobile {
    // % Variabili di istanza, campi, attributi, proprieta'
    public String colore;
    public String marca;
    public int anno;
    public int cavalli;

    public Automobile(String colore, String marca, int anno){
        this.colore = colore;
        this.marca = marca;
        this.anno = anno;
        this.cavalli = 50;
    }

    public Automobile(String colore, String marca, int anno, int cavalli){
        this.colore = colore;
        this.marca = marca;
        this.anno = anno;
        this.cavalli = cavalli;
    }

    // @ metodi
    public String accendi(){
        return "Mi sono accesa! Sono un'auto di marca " + marca + " e di colore " + colore + " immatricolata nell'anno " + anno + " e ho un motore da " + cavalli + " cavalli";
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public String getColore(){
        return colore;
    }

    public void setMarca(String marca){
        String marcaFormattata = Character.toUpperCase(marca.charAt(0)) + marca.substring(1).toLowerCase();
        this.marca = marcaFormattata;
    }

    public String getMarca(){
        return marca;
    }

    public void setAnno(int anno){
        this.anno = anno;
    }
    
    public int getAnno(){
        return anno;
    }

    public void setCavalli(int cavalli){
        this.cavalli = cavalli;
    }

    public int getCavalli(){
        return cavalli;
    }

    public int getEta(){
        return 2025 - anno;
    }

    public void cambiaColore(String nuovoColore){
        colore = nuovoColore;
    }
}
