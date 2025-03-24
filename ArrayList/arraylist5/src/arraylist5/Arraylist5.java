/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist5;

/**
 *
 * @author Biehl
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Biehl
 */
public class Arraylist5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        Scanner escolha = new Scanner(System.in);

        cidades.add("Porto Alegre");

        while (true) {
            System.out.println(cidades);
            System.out.println("Pesquise nossos cidades!!");
            String searchString = escolha.nextLine();

            if (cidades.contains(searchString)) {
                System.out.println("===========");
                System.out.println("Mude o nome!!");
                String trocarNome = escolha.nextLine();
                cidades.set(cidades.indexOf(searchString), trocarNome);
                System.out.println(cidades);

            } else {
                System.out.println("cidade nao encontrada");
            }
            System.out.println(cidades);
        }
    }

}
