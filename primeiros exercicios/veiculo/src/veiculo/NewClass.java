package veiculo;

public class NewClass {
    
    public static void main(String[] args) {
        
        carro meucarro = new carro(200);
        
        meucarro.exibirV();
        meucarro.setvelocidadeMax(100);
        meucarro.exibirV();
    }
    
}
