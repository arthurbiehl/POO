/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criativos;

/**
 *
 * @author Biehl
 */
public abstract class projetos {

    private String titulo;
    private String dataInicio;
    private double orcamento;

    public projetos(String titulo, String dataInicio, double orcamento) {
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.orcamento = orcamento;
    }

    public void getTitulo() {
        System.out.println(this.titulo);
    }

    public void getDataInicio() {
        System.out.println(this.dataInicio);
    }

    public double orcamento(double orcamento) {
        return this.orcamento;
    }

    public abstract int calcularPrazo();
}
