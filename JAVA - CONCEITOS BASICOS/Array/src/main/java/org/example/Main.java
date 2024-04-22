package org.example;

public class Main {
    public static void main(String[] args) {

        int valor = 1;
        int a1 = 0;
        int a2;

        for(int i = 0 ; i < 10 ; i++){
            a1 = i;
            valor = a1 + i;
            System.out.println(valor);
        }
    }

    public void fibonacci(){

    }

    public void exercicioOpicional(){
        String frase = "Socorram-me, subi no ônibus em Marrocos";
        String[] palavras = frase.split(" ");

        for(int i = palavras.length - 1; i >= 0; i--){
            System.out.print(palavras[i] + " ");
        }

/*        int[] teste = new int[-1];
        System.out.println(teste);*/
    }
    public void arrayIdades(){
        int[] idades = new int[10];
        for(int i = 0; i < 10 ; i++){
            idades[i] = i * 10;
            System.out.println(idades[i]);
        }
    }

    public void imprimeArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void arrayJava5(){
        int[] idades = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            idades[i] = i * 10;
        }
    }

    public void imprimeArray2(int[] array){
        for(int x : array){
            System.out.println(x);
        }
    }
}