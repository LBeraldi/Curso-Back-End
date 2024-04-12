package org.example;

class Conta {
    int numero;
    double saldo;
    double limite;
    Cliente titular = new Cliente();

    boolean sacar(double valor){
        if (this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }
    }
    void depositar(double valor){
        this.saldo += valor;
    }

    boolean transfere(Conta destino, double valor){
        boolean retirou = this.sacar(valor);
        if (retirou == false){
            return false;
        }else{
            destino.depositar(valor);
            return true;
        }
    }
}
