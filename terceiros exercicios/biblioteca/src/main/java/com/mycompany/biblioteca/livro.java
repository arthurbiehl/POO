/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author Biehl
 */
public class livro {
    

    public String titulo;
    public String autor;
    public Boolean disponivel;


    public livro(String titulo, String autor, Boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    /* funcoes */

    public void emprestar() {
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }

    /* metodos get */

    public void getTitulo() {
        System.out.println(this.titulo);
    }

    public void getAutor() {
        System.out.println(this.autor);
    }

    public void getDisponivel() {
        System.out.println(this.disponivel);
    }


}
