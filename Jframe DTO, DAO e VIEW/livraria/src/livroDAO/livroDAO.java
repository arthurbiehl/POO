/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livroDAO;

import javax.swing.JOptionPane;
import livroDTO.livroDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Biehl
 */
public class livroDAO {

    private List<livroDAO> livros;

    public livroDAO() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(livroDAO livro) {
        livros.add(livro);
    }
    
    public void removerLivro(livroDAO livro) {
        livros.remove(livro);
    }
    
    public List<livroDAO> listarLivros() {
        return new ArrayList<>(livros);
    }

    public void mostrarLivro(livroDTO ldto) {
        JOptionPane.showMessageDialog(null, ldto.toString());
    }

}
