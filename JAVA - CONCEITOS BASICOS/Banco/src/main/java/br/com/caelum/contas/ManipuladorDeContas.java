package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;
import lombok.Data;
import java.util.Collections;
import java.util.List;

@Data
public class ManipuladorDeContas extends Object {
    private Conta conta;

    public void criaConta(Evento evento) {
        String tipo = evento.getSelecionadoNoRadio("tipo");

        if (tipo.equals("Conta Corrente")) {
            this.conta = new ContaCorrente();
        } else if (tipo.equals("Conta Poupança")) {
            this.conta = new ContaPoupanca();
        }

        this.conta.setTitular(evento.getString("titular"));
        this.conta.setNumero(evento.getInt("numero"));
        this.conta.setAgencia(evento.getString("agencia"));

    }

    public void deposita(Evento evento) {
        double valorDigitado = evento.getDouble("valorOperacao");
        this.conta.deposita(valorDigitado);
    }

    public void saca(Evento evento) throws SaldoInsuficienteExeption {
        double valor = evento.getDouble("valorOperacao");
        if (this.conta.getTipo().equalsIgnoreCase("Conta Corrente")) {
            valor += 0.10;
            this.conta.saca(valor);
        } else {
            this.conta.saca(valor);
        }
    }

    public void transfere(Evento evento) throws SaldoInsuficienteExeption {
        Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
        this.conta.transfere(destino, evento.getDouble("valorTransferencia"));
    }

    public void ordenaLista(Evento evento){
        List<Conta> contas = evento.getLista("destino");
        Collections.sort(contas);
    }
}
