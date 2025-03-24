/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Biehl
 */
public class Arraulist6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Coloque palavras!!");
            String colocarPalavra = scanner.nextLine();
            palavras.add(colocarPalavra);

            if (colocarPalavra.equals("mostrar")) {
          
                int contador = 0;
                for (String palavra : palavras) {
                    if (palavra.equals("mostrar")) {
                        contador++;
                    }
                }

                System.out.println("A palavra 'mostrar' apareceu " + contador + " vezes.");
            }
            
            System.out.println(palavras);
        }
    }

}
