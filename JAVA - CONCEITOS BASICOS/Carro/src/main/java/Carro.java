import lombok.Data;

@Data
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

}
