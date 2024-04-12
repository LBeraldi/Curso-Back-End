package src.main.java.org.example;

class Conta {
    int numero;
    double saldo;
    double limite;
    String titular;

    boolean sacar(double valor){
        if (this.saldo < valor){
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }
    }
    void depositar(double valor){
        this.saldo += valor;
    }

    boolean transfere(Conta destino, double valor){
        boolean retirou = this.sacar(valor);
        if (retirou == false){
            return false;
        }else{
            destino.depositar(valor);
            return true;
        }
    }

    double calculaRendimento(){
        this.saldo = this.saldo * 0.1;
        return saldo;
    }

    public double recuperaDadosParaImpressao() {
        System.out.println("Saldo de : " + saldo);
        System.out.println("Rendimento de : " + calculaRendimento());
        System.out.println(titular);
        return saldo;
    }
}
