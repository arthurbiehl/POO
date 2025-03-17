/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escolas;

/**
 *
 * @author Biehl
 */
public class Escolas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        curso c1 = new curso("TI", "nao sei", 400);
        
        cursoTecnico ct1 = new cursoTecnico("TI", "nao sei", 20, false);
        
        c1.exibirInfo();
        System.out.println("==========");
        ct1.exibirInfo();
       
    
    }
    
}
