/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarioDAO;

import funcionarioDTO.funcionarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Biehl
 */
public class funcionarioDAO {
    
    public void mostrarFuncionario(funcionarioDTO fun) {
        
        String nome = fun.getNome();
        String cargo = fun.getCargo();
        double salario = fun.getSalario();
        
        JOptionPane.showMessageDialog(null, fun.toString());
        
    }
    
}
