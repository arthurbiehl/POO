/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas.pkg2;

/**
 *
 * @author Biehl
 */
public class circulo extends formation {
    
    // Atributo privado para o raio
    private double raio;

    // Construtor da subclasse
    public circulo(String cor, double raio) {
        super(cor);  // Chama o construtor da classe abstrata Forma
        this.raio = raio;
    }

    // Métodos sobrecarregados para definir o raio
    public void definirDimensoes(int raio) {
        this.raio = raio;  // Versão com int
    }

    public void definirDimensoes(double raio) {
        this.raio = raio;  // Versão com double
    }

    // Implementação do método abstrato calcularArea()
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;  // Fórmula para área do círculo
    }
}
