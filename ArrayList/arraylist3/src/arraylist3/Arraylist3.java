/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Biehl
 */
public class Arraylist3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<>();

        numeros.add("11");
        numeros.add("22");
        numeros.add("31");
        numeros.add("46");
        numeros.add("45");
        numeros.add("63");
        numeros.add("70");
        numeros.add("81");
        numeros.add("29");
        numeros.add("10");

        System.out.println("Lista nao ordenada: " + numeros);

        Collections.sort(numeros);

        System.out.println("Lista ordenada: " + numeros);

    }

}
