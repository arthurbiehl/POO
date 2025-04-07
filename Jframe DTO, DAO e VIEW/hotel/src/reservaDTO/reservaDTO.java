/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaDTO;

/**
 *
 * @author Biehl
 */
public class reservaDTO {

    private String client;
    private int numeroQuarto;
    private int dataEntrada;
    private int dataSaida;

    public reservaDTO() {
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public int getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(int dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public int getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(int dataSaida) {
        this.dataSaida = dataSaida;
    }
    @Override
    public String toString() {
        return "Cliente: " + client + "\n"
                + "Quarto: " + numeroQuarto + "\n"
                + "Entrada: " + dataEntrada + "\n"
                + "Saída: " + dataSaida;
    }

}
