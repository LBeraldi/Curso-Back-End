package org.example;

public class ProfessorFaculdade extends EmpregadoFaculdade {
    private int horasAulas;

    public double getGastos(){
        return this.getSalario() + this.horasAulas * 10;
    }

    public String getInfo(){
        String informacaoBasica = super.getInfo();
        String informacao = informacaoBasica + " Horas de aula: " + this.horasAulas;
        return informacao;
    }

    public int getHorasAulas() {
        return horasAulas;
    }

    public void setHorasAulas(int horasAulas) {
        this.horasAulas = horasAulas;
    }
}
