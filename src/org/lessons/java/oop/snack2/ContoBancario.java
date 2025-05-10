package org.lessons.java.oop.snack2;

public class ContoBancario {
    private int numeroConto;
    private float saldo;

    public ContoBancario(int numeroConto){
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public ContoBancario(int numeroConto, float saldo){
        this.numeroConto = numeroConto;
        this.saldo = saldo;
    }

    public void deposita(float deposito){
        // this.saldo = this.saldo + deposito;
        if (deposito > 0){
            this.saldo += deposito;
        }
    }
    
    public void preleva(float prelievo){
        // this.saldo = this.saldo - prelievo;
        if (prelievo > 0 && this.saldo >= prelievo){
            this.saldo -= prelievo;
        }
    }

    public float getSaldo(){
        return this.saldo;
    }

}
