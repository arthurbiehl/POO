/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.participanteauth;

/**
 *
 * @author Biehl
 */
public class participante {

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

        String emailV = this.email;
        if (email.contains("@")) {
            System.out.println("Email válido");
        } else {
            System.out.println("Email inválido");
        }

        return emailV;
    }

}
