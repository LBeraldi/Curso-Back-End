package br.com.caelum.contas;

public class Diretor extends Funcionario implements Autenticavel {
    protected int senha = 321;
    public boolean autentica(int senha){
        if (this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        }else{
            System.out.println("Acesso negado!");
            return true;
        }
    }

    public double getBonificacao(){
        return this.salario = salario * 1.4 + 1000;
    }
}
