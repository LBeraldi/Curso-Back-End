package org.example;

public class Main {
   public static void main(String[] args) {
       Gerente gerente = new Gerente();
       gerente.autentica(123);

       gerente.setSalario(2000);

       System.out.println(gerente.getSalario() );

/*       Conta minhaConta = new Conta();
       minhaConta.depositar(1000);

       Gerente gerente = new Gerente();
       gerente.setSenha(1234);

       gerente.autentica(gerente.getSenha());

       gerente.setSalario(5000.0);
       System.out.println(gerente.getBonificacao());*/


//       System.out.println(minhaConta.getSaldo());


/*       Conta c1 = new Conta();
       c1.titular = "Danilo";
       c1.saldo = 100;

       Conta c2 = new Conta();
       c2.titular = "Danilo";
       c2.saldo = 100;

       c2 = c1;
       
       if (c1 == c2) {
           System.out.println("iguais");
       } else {
           System.out.println("diferentes");
       }

       System.out.println(c1.calculaRendimento());
       System.out.println(c1.recuperaDadosParaImpressao());*/

/*  suaConta.saldo = 1000;
       suaConta.titular = "Teste";

        minhaConta.saldo = 100;
       minhaConta.titular = "Lucas";

       System.out.println("A conta " + suaConta.titular + " Tem um saldo de :" + suaConta.saldo);
       System.out.println("A conta " + minhaConta.titular + " Tem um saldo de :" + minhaConta.saldo);

        suaConta.transfere(minhaConta, 900);

       System.out.println("A conta " + suaConta.titular + " Tem um saldo de :" + suaConta.saldo);
       System.out.println("A conta " + minhaConta.titular + " Tem um saldo de :" + minhaConta.saldo);
*/

/*
        suaConta.saldo = 500;
        suaConta.titular = "Teste";

        minhaConta.saldo = 1500;
        minhaConta.titular = "Lucas";

       System.out.println("A conta " + suaConta.titular + " Tem um saldo de :" + suaConta.saldo);
       System.out.println("A conta " + minhaConta.titular + " Tem um saldo de :" + minhaConta.saldo);

       suaConta.sacar(400);
       minhaConta.depositar(400);

       System.out.println("A conta " + suaConta.titular + " Tem um saldo de :" + suaConta.saldo);
       System.out.println("A conta " + minhaConta.titular + " Tem um saldo de :" + minhaConta.saldo);
*/



/*        minhaConta.saldo = 1000;
        boolean consegui = minhaConta.sacar(2004);
        if (consegui){
            System.out.println("Consegui sacar!!");
        }else{
            System.out.printf("Não consegui sacar!!");
        }*/

    }
}

class ControleBonificacao{
    private double totalDeBonificacoes = 0;

    public void registra(Funcionario funcionario){
        System.out.println("Adicionando bonificação do funcionario: " + funcionario);
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
}