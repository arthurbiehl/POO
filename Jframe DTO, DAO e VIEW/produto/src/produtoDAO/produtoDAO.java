/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtoDAO;

import javax.swing.JOptionPane;
import produtoDTO.produtoDTO;

/**
 *
 * @author Biehl
 */
public class produtoDAO {

    public void criarProduto(produtoDTO produtoDTO) {
        String nome = produtoDTO.getNome();
        double preco = produtoDTO.getPreco();
        int qnt = produtoDTO.getQnt();

        JOptionPane.showMessageDialog(null, produtoDTO.toString());
    }

    public produtoDAO() {}

}
