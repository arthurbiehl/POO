/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Biehl
 */
public class Arraylist4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> produtos = new ArrayList<>();
        Scanner pesquisa = new Scanner(System.in);

       produtos.add("Ana");
       produtos.add("Carlos");
       produtos.add("Bruna");
       produtos.add("Daniel");
       produtos.add("Eduardo");

        while (true) {
            System.out.println(produtos);
            System.out.println("Pesquise nossos produtos!!");
            String searchString = pesquisa.nextLine();
            if (produtos.contains(searchString)) {
                System.out.println("Produto encontrado!!");

            } else {
                System.out.println("Produto nao encontrado");
            }
        }
    }
    
}
