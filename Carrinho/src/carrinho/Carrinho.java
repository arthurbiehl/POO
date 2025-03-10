package carrinho;

public class Carrinho {

    private String marca;
    private String modelo;
    private int ano;
    public double preco;
    
    public Carrinho(String marca, String modelo, int ano, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
    
    public String getmarca(){
        return this.marca;
    }
    public String getmodelo(){
        return this.modelo;
    }
    public int getano(){
        return this.ano;
    }
    public double getpreco(){
        return this.preco;
    }
    
    public void exibir(){
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
    }
}
