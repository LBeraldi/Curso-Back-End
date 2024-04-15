package org.example;

public class Main {
   public static void main(String[] args) {
       Conta minhaConta = new Conta();
       minhaConta.depositar(1000);
       minhaConta.sacar(5000);

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