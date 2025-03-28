package formulario;

public class GerenciadorNotas extends TelaNotas{
    public String VerificarSituacao(double media){
        if(media >= 7){
            return "Aprovado";
        }
        else{
            return "reprovado";
        }
    }
}
