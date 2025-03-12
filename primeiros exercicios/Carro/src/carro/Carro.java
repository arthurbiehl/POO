package carro;

public class Carro {

    private String marca;
    private String modelo;
    public int ano;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public void setano(int ano) {
        if (ano >= 1886) {
            this.ano = ano;
        } else {
            System.out.println("data invalida");
        }
    }

    public String getmarca() {
        return this.marca;
    }

    public String getmodelo() {
        return this.modelo;
    }

    public int getano() {
        return this.ano;
    }

    public void exibir() {
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        if (ano >= 1886) {
            System.out.println("ano: " + ano);
        } else {
            System.out.println("ano: data invalida");
        }
    }
}
