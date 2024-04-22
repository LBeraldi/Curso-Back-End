package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteExeption;

public class ContaCorrente extends Conta{
    @Override
    public String getTipo() {
        return "Conta corrente";
    }



}
