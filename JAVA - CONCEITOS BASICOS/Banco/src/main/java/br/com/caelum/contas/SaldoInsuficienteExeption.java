package br.com.caelum.contas;

public class SaldoInsuficienteExeption extends RuntimeException {
    public SaldoInsuficienteExeption(String erro){
        super(erro);
    }
}
