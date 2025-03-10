/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo.pkg2;

/**
 *
 * @author Biehl
 */
public class moto extends veiculo {

    private int cilindragens;

    public int getCilindragens() {
        return cilindragens;
    }

    public void setCilindragens(int cilindragens) {
        this.cilindragens = cilindragens;
    }

    /* contructor */
    public moto() {
    }
    
    /* extends */
    @Override
    public String descrever() {
        System.out.println("E uma moto");
        return null;
    }
    
    @Override
    public void exibirVL(double velocidadeMX) {
        System.out.println(velocidadeMX + "Km/h");
    }
}
