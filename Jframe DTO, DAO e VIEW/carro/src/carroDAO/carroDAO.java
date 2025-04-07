/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carroDAO;

import carroDTO.carroDTO;
import java.util.ArrayList;

/**
 *
 * @author Biehl
 */
public class carroDAO {
    
    private ArrayList<carroDTO> carrosVendidos = new ArrayList<>();


    public void venderCarro(carroDTO carro) {
        carrosVendidos.add(carro);
        System.out.println("Carro vendido: " + carro);
    }

    public ArrayList<carroDTO> listarVendas() {
        return carrosVendidos;
    }

    public double calcularTotalVendas() {
        double total = 0.0;
        for (carroDTO carro : carrosVendidos) {
            total += carro.getPreco();
        }
        return total;
    }
    
    
}
