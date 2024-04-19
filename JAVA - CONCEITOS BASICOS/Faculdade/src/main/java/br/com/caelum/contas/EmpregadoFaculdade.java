package br.com.caelum.contas;

public class EmpregadoFaculdade {
    private String nome;
    private double salario;

    public double getGastos(){
        return this.salario;
    }

    public String getInfo(){
        return "Nome: " + this.nome + " com salário: " + this.salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
