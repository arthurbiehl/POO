/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist9;

import java.util.ArrayList;

/**
 *
 * @author Biehl
 */
public class Arraylist9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<>();

        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        
        ArrayList<String> numeros2 = new ArrayList<>();
        numeros2.addAll(numeros);
        numeros2.remove(1);
        
        System.out.println(numeros2);
        
        System.out.println(numeros);
    }
    
}
