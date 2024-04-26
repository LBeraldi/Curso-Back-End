package org.example;
import java.io.*;
import java.util.Scanner;
public class Print {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner s = new Scanner(System.in);
//        PrintStream ps = new PrintStream("arquivo.txt");
//        while(s.hasNextLine()){
//            ps.println(s.nextLine());
//        }

        // Criando um objeto PrintStream para a saída padrão (System.out)
        PrintStream ps2 = System.out;

        // Imprimindo uma mensagem usando o método println
        ps2.println("Olá, mundo!");

        // Fechando o objeto PrintStream (opcional, mas uma boa prática)
        ps2.close();

// -----------------------------------------------------------

        // Nome do arquivo de destino
        String nomeArquivo = "arquivo.txt";

        // Criando um objeto File para representar o arquivo
        File arquivo = new File(nomeArquivo);

        try {
            // Criando um objeto FileOutputStream para o arquivo
            FileOutputStream fos = new FileOutputStream(arquivo);

            // Criando um objeto PrintStream que usa o FileOutputStream
            PrintStream ps = new PrintStream(fos);

            // Escrevendo no arquivo usando o PrintStream
            ps.println("Este é um exemplo de escrita em arquivo usando PrintStream.");
            ps.println("Podemos escrever várias linhas dessa forma.");

            // Fechando o PrintStream (isso também fecha o FileOutputStream)
            ps.close();

            System.out.println("Dados escritos no arquivo com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
