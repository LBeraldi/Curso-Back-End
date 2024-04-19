package br.com.caelum.contas;

import lombok.Data;

@Data
abstract class Conta {
    private int numero;
    private static int totalDeContas;
    protected double saldo;
    private double limite;
    protected String tipo;
    private String titular;
    private String agencia;

    Conta(String titular) {
        this.titular = titular;
    }

    Conta(int numero, String titular) {
        this(titular);
        this.numero = numero;
    }

    Conta() {
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }

    /*public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public abstract String getTipo();

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }*/

    public abstract String getTipo();


    boolean sacar(double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteExeption("Saldo insuficiente!" + " Tente um valor menor! ");
        } else {
            this.saldo -= valor;
            System.out.println("Conseguiu sacar! ");
            return true;
        }
    }

   /* public boolean equals(Object obj){
        if(obj == null){
          return false;
        }
        Conta outraConta = (Conta) obj;
        if (this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia)){
            return true;
        }
        return false;
    }*/

    void depositar(double valor) {
        this.saldo += valor;
    }

    boolean transfere(Conta destino, double valor) {
        boolean retirou = this.sacar(valor);
        if (retirou == false) {
            return false;
        } else {
            destino.depositar(valor);
            return true;
        }
    }

    double calculaRendimento() {
        this.saldo = this.saldo * 0.1;
        return saldo;
    }

    public void recuperaDadosParaImpressao() {
        System.out.println("Esta é uma: " + getTipo());
        System.out.println("Saldo de : " + saldo);
        System.out.println("Rendimento de : " + calculaRendimento());
        System.out.println(titular);
    }
}
