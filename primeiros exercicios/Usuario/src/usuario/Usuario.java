package usuario;

public class Usuario {

    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean autorizar(String login, String senha) {
        boolean emailCheck = this.login.equals(login);
        boolean senhaCheck = this.senha.equals(senha);

        boolean verifique = emailCheck == senhaCheck;
        
         if (!verifique) {
            System.out.println("Senha ou email incorretos...");
        } else {
            System.out.println("Bem-vindo");
        }

        return verifique;
        
    }
}
