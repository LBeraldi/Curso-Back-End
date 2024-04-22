package org.example;

public class Gerente extends Funcionario implements Autenticavel {
    protected int senha = 123;
    private int numeroDeFuncionariosGerenciados;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    public double getBonificacao(){
        return this.salario * 1.4 + 1000;
    }
}
