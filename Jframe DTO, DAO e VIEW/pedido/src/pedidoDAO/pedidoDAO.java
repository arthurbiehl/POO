/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidoDAO;

import java.util.ArrayList;
import java.util.List;
import pedidoDTO.pedidoDTO;

/**
 *
 * @author Biehl
 */
public class pedidoDAO {

    private List<pedidoDTO> listaPedidos = new ArrayList<>();

    public void adicionarPedido(pedidoDTO pedido) {
        listaPedidos.add(pedido);
    }

    public boolean removerPedido(int id) {
        for (pedidoDTO pedido : listaPedidos) {
            if (pedido.getId() == id) {
                listaPedidos.remove(pedido);
                return true; 
            }
        }
        return false;
    }

    public List<pedidoDTO> listarPedidos() {
        return new ArrayList<>(listaPedidos); 
    }
}
