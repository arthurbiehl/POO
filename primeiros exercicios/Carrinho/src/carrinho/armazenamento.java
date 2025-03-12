package carrinho;

public class armazenamento {
    public static void main(String[] args) {
        Carrinho car1 = new Carrinho("chevrolet", "chevette", 1993, 10882.00);
        Carrinho car2 = new Carrinho("chevrolet", "fusca", 1975, 27452.00);
        Carrinho car3 = new Carrinho("ford", "maverick", 1974, 70000.);
        Carrinho car4 = new Carrinho("chevrolet", "opala", 1979, 26021.00);
        
        car1.exibir();
    }
}
