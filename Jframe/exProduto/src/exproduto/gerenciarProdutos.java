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
class gerenciarProdutos { 
    private final ArrayList<produto> produtos;

    public gerenciarProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(produto p) {
        produtos.add(p);
    }

    public String listarProdutos() { // Agora retorna uma String
        StringBuilder lista = new StringBuilder();
        for (produto p : produtos) {
            lista.append(p.toString()).append("\n"); // Concatena os produtos
        }
        return lista.toString();
    }
}