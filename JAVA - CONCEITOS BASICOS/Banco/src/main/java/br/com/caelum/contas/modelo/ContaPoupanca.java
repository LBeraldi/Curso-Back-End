package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteExeption;
import lombok.Data;

@Data
public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, String titular, String agencia) {
        super(numero, titular, agencia);
    }

    public ContaPoupanca() {
    }

    @Override
    public String getTipo()  {
        return "Conta poupanca";
    }

}
