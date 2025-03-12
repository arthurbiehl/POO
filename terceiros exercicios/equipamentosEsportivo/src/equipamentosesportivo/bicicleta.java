/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipamentosesportivo;

/**
 *
 * @author Biehl
 */
public class bicicleta extends equipamento {
    
    private String tipo;
    
    public bicicleta(String nome, double aluguel, String tipo) {
        super(nome, aluguel);
        this.tipo = tipo;
        
    }

    /* get e set */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public int definirDurabilidade() {
        return 100;
    }
    
}
