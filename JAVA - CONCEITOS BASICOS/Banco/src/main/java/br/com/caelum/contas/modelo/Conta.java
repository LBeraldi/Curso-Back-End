package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteExeption;
import lombok.Data;

@Data
public abstract class Conta {
    private int numero;
    private static int totalDeContas;
    public double saldo;
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

    public abstract String getTipo();

    public boolean saca(double valor) throws SaldoInsuficienteExeption{
        if (this.saldo < valor)  {
            throw new SaldoInsuficienteExeption("Saldo insuficiente!" + " Tente um valor menor!");
        } else {
            this.saldo -= valor;
            System.out.println("Conseguiu sacar!");
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

    public void deposita(double valor) {
        this.saldo += valor;
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
    public void transfere(Conta conta, double valor) {
        try {
            this.saca(valor);
            conta.deposita(valor);
        } catch (SaldoInsuficienteExeption e) {
            System.out.println(e);
        }
    }
}
