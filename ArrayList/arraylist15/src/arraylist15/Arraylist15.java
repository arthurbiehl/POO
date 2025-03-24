/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist15;

import java.util.ArrayList;

/**
 *
 * @author Biehl
 */
public class Arraylist15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<>();

        students.add(new student("arthur", 7));
        students.add(new student("will", 6));

        for (student p : students) {
            p.exibir();
        }

    }

}
