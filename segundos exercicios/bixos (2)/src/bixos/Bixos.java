/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bixos;

/**
 *
 * @author Biehl
 */
public class Bixos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        animal obj = new animal();
        cachorro cachorro = new cachorro();
        gato gato = new gato();
        
        
        obj.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
    }
    
}
