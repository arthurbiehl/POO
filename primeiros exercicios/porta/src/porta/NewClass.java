package porta;

public class NewClass {

    private static boolean estado;
    
    public static void main(String[] args) {
        Porta porta1 = new Porta(estado);
        
        porta1.exibir();
        porta1.fechar();
        porta1.exibir();
    }
}
