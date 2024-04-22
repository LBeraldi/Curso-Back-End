package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;
import lombok.Data;

@Data
public class ManipuladorDeTributaveis {
    private double total;

    public void calculaImpostos(Evento evento) {
        int tributaveis = evento.getTamanhoDaLista("listaTributaveis");

        for (int i = 0; i < tributaveis; i++) {
            Tributavel tributavel = evento.getTributavel("listaTributaveis", i);
            total += tributavel.getValorImposto();
        }
    }

}
