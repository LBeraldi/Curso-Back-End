package org.example;

public class ContaCorrente {
    private double saldo;

    public void deposita(int valor){
        this.saldo = valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
