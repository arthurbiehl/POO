package retangulo;

public class Retangulo {

    public int largura;
    public int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void exibir() {
        int conta = largura * altura;
        int resultado = conta/2;
        
        System.out.println("altura: " + altura);
        System.out.println("largura: " + largura);
        System.out.println("area do triangulo: " + resultado);
    }
}
