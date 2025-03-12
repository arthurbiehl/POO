/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package criativos;

/**
 *
 * @author Biehl
 */
public class musica extends projetos {
    
    public int numeroNotas;
    
    public musica(String titulo, String dataInicio, double orcamento, int numeroNotas) {
        super(titulo, dataInicio, orcamento);
        this.numeroNotas = numeroNotas;
    }
    
    @Override
    public int calcularPrazo() {
        int prazo = this.numeroNotas / 50;
        return prazo;
    }

    
}
