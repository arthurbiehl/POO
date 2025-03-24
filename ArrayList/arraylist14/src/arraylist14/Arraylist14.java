/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Biehl
 */
public class Arraylist14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("============");

            System.out.println("O que deseja fazer:");
            Syst1em.out.println(lista);

            System.out.println("1. Criar");
            System.out.println("2. Editar");
            System.out.println("3. excluir");

            System.out.println("Escolha:");
            int escolha = scanner.nextInt();

            System.out.println("============");

            switch (escolha) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o nome para adicionar a lista");
                    String addString = scanner.nextLine();
                    lista.add(addString);
                    System.out.println("Item " + addString + " adicionado com sucesso!");

                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Digite o nome para editar a lista");
                    String editString = scanner.nextLine();

                    if (lista.contains(editString)) {
                        System.out.println("Item: " + editString);
                        System.out.println("Deseja trocar pelo o que?");
                        String editing = scanner.nextLine();

                        lista.set(lista.indexOf(editString), editing);

                        System.out.println("Item editado com sucesso!");

                    } else {
                        System.out.println("Item nao encontrado!");
                    }

                    break;

                case 3:

                    scanner.nextLine();
                    System.out.println("Digite o nome para excluir da lista");
                    String deleteString = scanner.nextLine();
                    if (lista.contains(deleteString)) {
                        lista.remove(deleteString);
                        System.out.println("Item excluido com sucesso!");
                    } else {
                        System.out.println("Item nao encontrado!");
                    }

                    break;

                default:
                    throw new AssertionError();
            }

        }

    }

}
