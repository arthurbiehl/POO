/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criativos;

/**
 *
 * @author Biehl
 */
public class filme extends projetos{

    private int duracaoMinutos;

    public filme(String titulo, String dataInicio, double orcamento, int duracaoMinutos) {
        super(titulo, dataInicio, orcamento);
        this.duracaoMinutos = duracaoMinutos;
    }


    @Override
    public int calcularPrazo() {
        int prazo = this.duracaoMinutos / 100;
        return prazo;
    }
    
}
