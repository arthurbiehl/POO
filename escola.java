public abstract class escola {
    
    public String nome;
    public String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public escola(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public abstract int calcularMensalidade();
   
    
}