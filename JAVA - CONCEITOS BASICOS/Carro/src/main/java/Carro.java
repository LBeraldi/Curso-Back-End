public class Carro {
    String cor;
    String modelo;
    double velocidadeMaxima;
    double velocidadeAtual;
    void liga (){
        System.out.printf("O carro esta ligado!!");
    }

    void acelera(double valor){
        double velocidadeNova = this.velocidadeAtual + valor;
        this.velocidadeAtual = velocidadeNova;
    }

    void pegaMarcha(){
        if (this.velocidadeAtual < 0){
            return -1;
        } else if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        } else if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }else{
            return 3;
        }
    }

}
