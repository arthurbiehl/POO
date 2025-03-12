package produtoprivado;

public class loja {
        
    public static void main(String[] args){
        produto p1 = new produto("bolacha", 2.54);
        produto p2 = new produto("cerveja");
        produto p3 = new produto();
    
        p1.exibir();
    }
}
