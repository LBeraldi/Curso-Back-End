package org.example;

 abstract class Conta {
    int numero;
    private double saldo;
    protected String tipo;
    private double limite;
    private String titular;
    private static int totalDeContas;

    Conta(String titular){
        this.titular = titular;
    }

    Conta(int numero, String titular ){
        this(titular);
        this.numero = numero;
    }
    Conta(){
        Conta.totalDeContas = Conta.totalDeContas + 1;
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

     public static int getTotalDeContas() {
         return totalDeContas;
     }

     public void setTitular(String titular) {
         this.titular = titular;
     }

     boolean sacar(double valor){
        if (this.saldo < valor){
            throw new IllegalArgumentException("Saldo insuficiente!");
        }else{
            this.saldo -= valor;
            System.out.println("Conseguiu sacar! ");
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

    double calculaRendimento(){
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
