/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist15;

/**
 *
 * @author Biehl
 */
public class student {
    
    private String nome;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public student(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    public void exibir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota: " + this.nota);
    }
    
}
