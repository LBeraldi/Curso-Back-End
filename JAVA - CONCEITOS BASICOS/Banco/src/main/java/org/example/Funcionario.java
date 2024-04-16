package org.example;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

//    @Override
    public double getBonificacao() {
        return this.salario * 0.10;
    }

}
