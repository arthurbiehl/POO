/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo.pkg2;

/**
 *
 * @author Biehl
 */
public class veiculo {

    protected double velocidadeMX;
    
    public veiculo() {}
    
    public String descrever() {
         System.out.println("descricao");
        return null;
    }
    
    public void exibirVL(double velocidadeMX) {
        System.out.println(velocidadeMX + "Km/h");
    }

}
