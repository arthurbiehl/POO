/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas.pkg2;

/**
 *
 * @author Biehl
 */
// Classe abstrata Forma
public abstract class formation {
    
    // Atributo protegido
    protected String cor;

    // Construtor da classe
    public formation(String cor) {
        this.cor = cor;
    }

    // Método abstrato para calcular a área, que deve ser implementado pelas subclasses
    public abstract double calcularArea();

    // Getter para o atributo cor
    public String getCor() {
        return cor;
    }

    // Setter para o atributo cor
    public void setCor(String cor) {
        this.cor = cor;
    }
}
