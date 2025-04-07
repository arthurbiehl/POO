/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidoDTO;

/**
 *
 * @author Biehl
 */
public class pedidoDTO {

    private int id;
    private String cliente;
    private int itens;
    private int total;

    public pedidoDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getItens() {
        return itens;
    }

    public void setItens(int itens) {
        this.itens = itens;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "📦 Pedido ID: " + id + "\n"
                + "👤 Cliente: " + cliente + "\n"
                + "🧾 Itens: " + itens + "\n"
                + "💰 Total: R$ " + total + "\n"
                + "---------------------------";
    }

}
