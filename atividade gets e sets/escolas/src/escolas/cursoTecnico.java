/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escolas;

/**
 *
 * @author Biehl
 */
public class cursoTecnico extends curso{

    public boolean modalidade;

    public cursoTecnico(String nome, String endereco, int cargaHoraria, boolean modalidade) {
        super(nome, endereco, cargaHoraria);
        this.modalidade = modalidade;

        
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("carga Horaria: " + this.cargaHorarioa + "h");
        
        if (!this.modalidade) {
            System.out.println("modalidade: online");
        }else {
            System.out.println("modalidade: presencial");
        }
        
    }
    
    @Override
    public int calcularMensalidade() {
        int mensalidade = 10;
        if(cargaHorarioa < 10) {
            mensalidade = 15;
        }else if(cargaHorarioa < 20) {
            mensalidade = 25;
        }else {
            mensalidade = 30;
        }
        
        System.out.println(mensalidade);
        
        return mensalidade;
    }

}
