package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class ControleBonificacao {
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario funcionario) {
        System.out.println("Adicionando bonificação do funcionario: " + funcionario);
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}