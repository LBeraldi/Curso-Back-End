package br.com.caelum.contas;

public class SaldoInsuficienteExeption extends RuntimeException {
    public SaldoInsuficienteExeption(double valor) {
        super("Saldo insuficiente para sacar o valor de: " + valor);
    }
}
