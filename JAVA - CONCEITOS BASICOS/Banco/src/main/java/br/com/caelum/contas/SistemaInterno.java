package br.com.caelum.contas;

public class SistemaInterno {

    public void login(Autenticavel a){
        boolean ok = a.autentica(1234);
        if(ok){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }
    }
}
