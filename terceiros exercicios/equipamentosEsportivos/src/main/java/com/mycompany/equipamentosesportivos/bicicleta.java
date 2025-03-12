/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipamentosesportivos;

/**
 *
 * @author Biehl
 */
public class bicicleta extends equipamento{
    
    private String tipo;
    
    public bicicleta(String nomeEquipamento, double aluguel, String tipo) {
        super(nomeEquipamento, aluguel);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        System.out.println("tipo");
    }
    
    @Override
    public int definirDurabilidade(){
        return 100;
    }
    
    
    
} 
