package org.example;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    int senha;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

//    @Override
    public abstract double getBonificacao() ;

}
