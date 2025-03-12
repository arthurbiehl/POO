/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas.pkg2;

/**
 *
 * @author Biehl
 */
public class retangulo extends formation {
    
    // Atributos privados para largura e altura
    private double largura;
    private double altura;

    // Construtor da subclasse
    public retangulo(String cor, double largura, double altura) {
        super(cor);  // Chama o construtor da classe abstrata Forma
        this.largura = largura;
        this.altura = altura;
    }

    // Método para definir as dimensões do retângulo (largura e altura)
    public void definirDimensoes(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação do método abstrato calcularArea()
    @Override
    public double calcularArea() {
        return largura * altura;  // Fórmula para área do retângulo
    }
}

