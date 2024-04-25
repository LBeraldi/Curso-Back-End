package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

import java.io.*;
import java.util.*;

public class RepositorioDeContas {
    public static void salva(List<Conta> contas){
        try (PrintStream ps = new PrintStream(new FileOutputStream("contas.txt"))) {
            for (Conta conta : contas) {
                String linha = conta.getTipo() + "," + conta.getNumero() + "," + conta.getAgencia() + ","
                        + conta.getTitular() + "," + conta.getSaldo();
                ps.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar contas", e);
        }
    }

    public List<Conta> carrega(){
        List<Conta> contas = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("contas.txt"))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] valores = linha.split(",");
                String tipo = valores[0];
                int numero = Integer.parseInt(valores[1]);
                String agencia = (valores[2]);
                String titular = valores[3];
                double saldo = Double.parseDouble(valores[4]);

                Conta conta;
                if (tipo.equalsIgnoreCase("Conta Corrente")) {
                    conta = new ContaCorrente(numero, titular, agencia );
                } else {
                    conta = new ContaPoupanca(numero, titular, agencia);
                }
                conta.deposita(saldo);
                contas.add(conta);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        }
        return contas;
    }
}
