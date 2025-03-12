package veiculo;

public class Veiculo {
    
    protected int velocidadeMax;
    
    public Veiculo(int velocidadeMax){
        this.velocidadeMax = velocidadeMax;
    }
    
    public void exibirV(){
        System.out.println("Velocidade maxima: " + velocidadeMax + "km/h");
    }
    
    public void setvelocidadeMax(int velocidadeMax){
        this.velocidadeMax = velocidadeMax;
    }
}
