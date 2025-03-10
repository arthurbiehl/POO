package porta;

public class Porta {
    
    public boolean estado;
    
    public Porta(boolean estado){
        this.estado = estado;
    }
    
    public boolean abrir(){
        this.estado = true;
        return this.estado;
    }
    public boolean fechar(){
        this.estado = false;
        return this.estado;
    }
    
    private boolean verificar(){
        
        if(this.estado == true){
            System.out.println("a porta foi aberta");
        } else{
            System.out.println("a porta esta fechada");
        }
        return this.estado;
    }
    
    public boolean exibir(){
        verificar();
        return this.estado;
    }
}
