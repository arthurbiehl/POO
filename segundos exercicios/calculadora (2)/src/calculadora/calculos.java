/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Biehl
 */
public class calculos {
    
    public int numero1;
    public int numero2;
    public int numero3;
    public double numeroD1;
    public double numeroD2;
    
    public calculos () {}
    
    public int multiplicar(int numero1, int numero2) {
        int calculoDois = numero1 * numero2;

        if( calculoDois < 0) {
            System.out.println("O resultado é: " + 0);
            return 0;
        } else {
            System.out.println("O resultado é: " + calculoDois);
        }
        
        return calculoDois;
    }
    
    public int multiplicar(int numero1, int numero2, int numero3) {
        int calculoTres = numero1 * numero2 * numero3;
        
        if (calculoTres < 0) {
            System.out.println("O resultado é: " + 0);
            return 0;
        }else {
            System.out.println("O resultado é: " + calculoTres);
        }

        return calculoTres;
    }
    public int multiplicar(double numeroD1, double numeroD2) {
        double calculoDouble = numeroD1 * numeroD2;

        if (calculoDouble < 0) {
            System.out.println("O resultado é: " + 0);
            return 0;
        }else {
            System.out.println("O resultado é: " + calculoDouble);
        }
        
        return (int) calculoDouble;
    }
    
}
