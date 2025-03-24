/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist12;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Biehl
 */
public class Arraylist12 {

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

        ArrayList<Integer> numerosInt = new ArrayList<>();
        for (String num : numeros) {
            numerosInt.add(Integer.valueOf(num));
        }
        
        int menor = Collections.min(numerosInt);
        int maior = Collections.max(numerosInt);

        System.out.println("Lista de numeros: " + numeros);
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);

    }
    
}
