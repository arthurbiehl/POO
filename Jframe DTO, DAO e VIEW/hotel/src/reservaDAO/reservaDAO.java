/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaDAO;

import java.util.ArrayList;
import reservaDTO.reservaDTO;
import java.util.List;

/**
 *
 * @author Biehl
 */
public class reservaDAO {

    private ArrayList<reservaDTO> reservas = new ArrayList<>();
    

    public void criarReserva(reservaDTO reserva) {
        reservas.add(reserva);
    }

    public List<reservaDTO> listarTodasReservas() {
        return new ArrayList<>(reservas);
    }

}
