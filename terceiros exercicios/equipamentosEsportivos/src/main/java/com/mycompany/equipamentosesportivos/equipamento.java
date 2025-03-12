/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipamentosesportivos;

/**
 *
 * @author Biehl
 */





public abstract class equipamento {
    public String nomeEquiamento;
    public double aluguel;

    public void equiamento(String nomeEquiamento, double aluguel) {
        this.nomeEquiamento = nomeEquiamento;
        this.aluguel = aluguel;
    }

    /* get e set */

    public void getNomeEquiamento() {
        System.out.println(this.nomeEquiamento);
    }

    public String setNomeEquiamento(String nomeEquiamento) {
        return this.nomeEquiamento;
    }

    public void getAluguel() {
        System.out.println(this.aluguel);
    }

    public double setAluguel(double aluguel) {
        return this.aluguel;
    }

    public abstract int definirDurabilidade();
    
}
