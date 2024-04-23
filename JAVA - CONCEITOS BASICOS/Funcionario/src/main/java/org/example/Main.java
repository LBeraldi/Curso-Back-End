package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "<.>>..>.<..>";
        String teste = s.replaceAll("\\.", "");
        System.out.println(s);
        System.out.println("Saida: " + teste);

        char[] ms = teste.toCharArray();

        for(int i = 0 ; i < ms.length; i++){
            System.out.println(ms[i]);
            int c = 0;
            if(ms[i] == "<"){
                c++;
            }
            System.out.println(c);
        }
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