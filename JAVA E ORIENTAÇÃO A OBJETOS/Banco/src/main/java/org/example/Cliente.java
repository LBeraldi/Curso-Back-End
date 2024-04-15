package src.main.java.org.example;

public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    Cliente(String cpf){
        this.cpf = cpf;
    }

    public void mudaCPF(String cpf) {
        validaCPF(cpf);
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {
        // série de regras aqui falha caso não seja válida.
    }


}
