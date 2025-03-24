/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist7;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Biehl
 */
public class Arraylist7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<>();

        numeros.add("1");
        numeros.add("2");
        numeros.add("2");


        /* Remover duplicatas */

        Set<String> s = new LinkedHashSet<String>(numeros);
        
        System.out.println(s);
        

    }

}
