package br.com.caelum.contas;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
    private Conta conta;

    public void criaConta(Evento evento){
        this.conta = new ContaCorrente();
        this.conta.setTitular("Batman");
    }

    public void deposita(Evento evento){
        double valorDigitado = evento.getDouble("valor");
        this.conta.depositar(valorDigitado);
    }
}
