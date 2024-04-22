package br.com.caelum.contas;

public class SaldoInsuficienteExeption extends Exception {
    public SaldoInsuficienteExeption(String erro){
        super(erro);
    }
}
