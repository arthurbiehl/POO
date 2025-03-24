/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist13;

import java.util.ArrayList;

/**
 *
 * @author Biehl
 */
public class Arraylist13 {

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

        numeros2.add("6");
        numeros2.add("7");
        numeros2.add("8");
        numeros2.add("9");
        numeros2.add("10");

        ArrayList<String> numeros3 = new ArrayList<>();

        /* juntas arrays */
        numeros3.addAll(numeros);
        numeros3.addAll(numeros2);

        System.out.println(numeros3);
    }

}
