package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Joaquim");
        lista.add("6");
        lista.add("Lucas");
        lista.add("1");

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

        System.out.println("------------------------");

        lista.add("3");
        lista.add("Manoel");


        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

        System.out.println("------------------------");

        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(100);

        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(200);

        ContaCorrente c3 = new ContaCorrente();
        c3.deposita(150);

        List<ContaCorrente> contas = new ArrayList<ContaCorrente>();// Os paramentros ao lado indica que nossa lista foi
        // criada para trabalhar exclusivamente com objetos do tipo ContaCorrente
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        for (int i = 0; i < contas.size(); i++) {
            ContaCorrente cc = (ContaCorrente) contas.get(i);
            System.out.println(cc.getSaldo());
        }

        contas.remove(c2);

        System.out.println("------------------------");
        for (int i = 0; i < contas.size(); i++) {
            ContaCorrente cc = (ContaCorrente) contas.get(i);
            System.out.println(cc.getSaldo());
        }

        System.out.println(contas.size());

        System.out.println(contas.contains(c2));

        System.out.println("------------------------");

        ContaCorrente cc = new ContaCorrente();

        Collections.sort(contas);
    }
}

class Agencia{

    private ArrayList<ContaCorrente> conta;

    public ArrayList<ContaCorrente> buscaTodasContas(){
        ArrayList<ContaCorrente> contas = new ArrayList<>();
        return contas;
    }
}