/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escolas;

/**
 *
 * @author Biehl
 */
public abstract class escola {
    
    public String nome;
    public String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public escola(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public abstract int calcularMensalidade();
   
    
}
