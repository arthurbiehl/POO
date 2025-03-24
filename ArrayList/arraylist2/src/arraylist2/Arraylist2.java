/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Biehl
 */
public class Arraylist2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        Scanner escolha = new Scanner(System.in);

        name.add("Ana");
        name.add("Carlos");
        name.add("Bruna");
        name.add("Daniel");
        name.add("Eduardo");

        while (true) {
            System.out.println(name);
            System.out.println("Digite o nome para tirar da lista");
            String removeString = escolha.nextLine();
            if (name.contains(removeString)) {
                name.remove(removeString);
                System.out.println("Removida com sucesso!");

            } else {
                System.out.println("nome nao existe");
            }
            System.out.println(name);
        }

    }

}
