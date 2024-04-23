package br.com.caelum.contas.modelo;
import java.lang.Comparable;
import br.com.caelum.contas.SaldoInsuficienteExeption;
import org.jetbrains.annotations.NotNull;

public class ContaCorrente extends Conta implements Tributavel{
    private double imposto;
    @Override
    public String getTipo() {
        return "Conta corrente";
    }

    @Override
    public double getValorImposto() {
        return this.saldo * 0.01;
    }

/*    @Override
    public int compareTo(@NotNull ContaCorrente outra) {
        if(this.saldo < outra.saldo){
            return -1;
        }else if(this.saldo > outra.saldo) {
            return 1;
        }else{
            return 0;
        }
    }*/
}
