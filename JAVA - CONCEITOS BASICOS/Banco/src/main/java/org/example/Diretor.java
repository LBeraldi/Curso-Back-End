package org.example;

public class Diretor extends Funcionario{
    protected int senha;
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
