package br.com.caelum.contas;

public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    Cliente(String nome){
        this.nome = nome;
    }

    public void mudaCPF(String cpf) {
        validaCPF(cpf);
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {
        // série de regras aqui falha caso não seja válida.
    }


}
