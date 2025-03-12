package usuario;

public class armazem {
    
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("admin", "123");
        Usuario usuario2 = new Usuario("abielado", "1322");
        Usuario usuario3 = new Usuario();
        Usuario usuario4 = new Usuario();
        
        usuario1.autorizar("abielado", "1322");
    }
}
