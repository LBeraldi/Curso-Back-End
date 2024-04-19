package br.com.caelum.contas;

import lombok.Data;

@Data
public class ContaPoupanca extends Conta{
    @Override
    public String getTipo()  {
        return "Conta poupanca";
    }
}
