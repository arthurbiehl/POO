/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificacaoparticipante;

/**
 *
 * @author Biehl
 */
public class participante {

    public participante(String string, String string1) {
    }

    public String nome;
    public String email;
    public String dataverificacao;

    public void participante(String nome, String dataverificacao) {
        this.nome = nome;
        this.dataverificacao = dataverificacao;
    }


    /* public String getNome() */
    public void getNome() {
        System.out.println(this.nome);
    }

    public String setNome(String nome) {
        this.nome = nome;
        return this.nome;
    }

    /*public String getEmail() */
    public String setEmail(String email) {

        String emailV = email;
        if (email.contains("@")) {
            System.out.println("Email válido");

        } else {
            System.out.println("Email invalido");
        }
        return emailV;
    }

}
