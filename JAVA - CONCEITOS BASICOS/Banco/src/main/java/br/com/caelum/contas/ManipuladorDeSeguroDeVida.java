package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;
import lombok.Data;

@Data
public class ManipuladorDeSeguroDeVida {
    private SeguroDeVida SeguroDeVida;

    public void criaSeguro(Evento evento){
        this.SeguroDeVida.setNumeroApolice(evento.getInt("numeroApolice"));
        this.SeguroDeVida.setTitular(evento.getString("titular"));
        this.SeguroDeVida.setValor(evento.getDouble("valor"));
    }
}