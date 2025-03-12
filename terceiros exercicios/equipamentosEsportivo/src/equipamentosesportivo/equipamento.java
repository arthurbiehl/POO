/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipamentosesportivo;

/**
 *
 * @author Biehl
 */
public abstract class equipamento {
    
    private String nome;
    private double aluguel;
    
    public equipamento(String nome, double aluguel) {
        this.nome = nome;
        this.aluguel = aluguel;
        
    }
    
    /* get e set*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }
    
    public abstract int definirDurabilidade();
    
   
    
    
    
    
}
