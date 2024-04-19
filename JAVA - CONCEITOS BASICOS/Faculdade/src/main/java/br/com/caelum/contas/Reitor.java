package br.com.caelum.contas;

public class Reitor extends EmpregadoFaculdade{
    public String getInfo(){
        return super.getInfo() + " e ele é o reitor.";
    }

//    NÃO Sobreescrevemos o getGastos!!
}
