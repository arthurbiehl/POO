package contabancaria;

public class NewClass {
    
    public static void main(String[] args) {
        ContaBancaria cnt1 = new ContaBancaria("arthur biehl", 0.0, 1);
        
        cnt1.exibir();
        cnt1.depositar(60.0);
        cnt1.exibir();
        cnt1.resgatar(20.0);
        cnt1.exibir();
    }
}
