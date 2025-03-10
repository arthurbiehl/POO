package produtoprivado;

public class produto {
    
    private String nome;
    private double preco;
    
    public produto(){
    }
    public produto(String nome){
        this.nome = nome;
    }
    public produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public void exibir(){
        System.out.println("nome: " + nome);
        System.out.println("preço: " + preco);
    }
    public String getnome(){
        return this.nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public double getpreco(){
        return this.preco;
    }
    public void setpreco(double preco){
        this.preco = preco;
    }
}
