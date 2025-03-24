/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist8;

import java.util.ArrayList;

/**
 *
 * @author Biehl
 */
public class Arraylist8 {

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
        
        for (int j = numeros.size() - 1; j >= 0; j--) {
            System.out.println(numeros.get(j));
        }
        
        

    }

}
