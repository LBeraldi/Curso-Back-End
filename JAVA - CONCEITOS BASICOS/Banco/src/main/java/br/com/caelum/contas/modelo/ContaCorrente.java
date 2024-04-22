package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteExeption;

public class ContaCorrente extends Conta implements Tributavel{
    private double imposto;
    @Override
    public String getTipo() {
        return "Conta corrente";
    }


    @Override
    public double getValorImposto() {
        return this.saldo * 0.01;
    }
}
