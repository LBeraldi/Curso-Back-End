package io.github.lberaldi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String diamante = ".<..><....>..<";

        String diamanteTratado = diamante.replaceAll("\\.", "");

        System.out.println(diamanteTratado);

        char[] diamanteTratado2 = diamanteTratado.toCharArray();

        for(int i = 0; i < diamanteTratado2.length ; i++){
            System.out.println(diamanteTratado2[i]);

            if(diamanteTratado2[i].equals("<")){

            }
        }
    }

}