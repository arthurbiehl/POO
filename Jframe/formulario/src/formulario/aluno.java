package formulario;

public class aluno {

    public String nome;
    public double n1, n2;

    public aluno(String nome, double n1, double n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public double CalcularMedia(){
        double continha = (n1 + n2);
        double conta = continha / 2;
        return conta;
    }
    
    @Override
    public String toString(){
        return "Aluno: " + nome + " | Média: " + CalcularMedia();
    }
}
