/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carroDTO;

/**
 *
 * @author Biehl
 */
public class carroDTO {

    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    @Override
    public String toString() {
        return "Carro {"
                + "\n  Modelo: " + modelo
                + "\n  Marca: " + marca
                + "\n  Ano: " + ano
                + "\n  Preço: R$ " + String.format("%.2f", preco)
                + "\n}";
    }

    public carroDTO() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
