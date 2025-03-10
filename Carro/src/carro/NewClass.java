package carro;

public class NewClass {
        public static void main(String[] args) {
        
            Carro car1 = new Carro("chevrolet", "Chevette", 1971);
            Carro car2 = new Carro("carroça", "carroça", 1885);
            Carro car3 = new Carro();
            
            car3.exibir();
    }
}
