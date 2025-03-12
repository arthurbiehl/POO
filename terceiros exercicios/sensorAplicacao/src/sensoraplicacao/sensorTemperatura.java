/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensoraplicacao;

/**
 *
 * @author Biehl
 */
public class sensorTemperatura extends sensor {

    private String unidade;

    public sensorTemperatura(String localizacao, int bateria, boolean ativo, String unidade) {
        super(localizacao, bateria, ativo);
        this.unidade = unidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    @Override
    public double coletarDados() {
        return 25.5;
    }


    
}

