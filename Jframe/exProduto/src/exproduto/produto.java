/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exproduto;

import java.util.ArrayList;

/**
 *
 * @author Biehl
 */
public class produto {

    private String nome, marca, desc;
    private double preco;
    private int qnt;

    public produto(String nome, String marca, String desc, double preco, int qnt) {
        this.nome = nome;
        this.marca = marca;
        this.desc = desc;
        this.preco = preco;
        this.qnt = qnt;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double calcularTotal() { // Método corrigido
        return preco * qnt;
    }

    @Override
    public String toString() {
        return "Produto{"
                + "nome='" + nome + '\''
                + ", marca='" + marca + '\''
                + ", descricao='" + desc + '\''
                + ", preco=" + preco
                + ", quantidade=" + qnt
                + ", total=" + calcularTotal()
                + '}';
    }

}
