package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteExeption;
import lombok.Data;

@Data
public class ContaPoupanca extends Conta{
    @Override
    public String getTipo()  {
        return "Conta poupanca";
    }

}
