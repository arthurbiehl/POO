/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensoraplicacao;

/**
 *
 * @author Biehl
 */
public class sensorUmidade extends sensor {

    private int precisao;

    public sensorUmidade(String localizacao, int bateria, boolean ativo, int precisao) {
        super(localizacao, bateria, ativo);
        this.precisao = precisao;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    @Override
    public double coletarDados() {
        return 60.0;
    }
}