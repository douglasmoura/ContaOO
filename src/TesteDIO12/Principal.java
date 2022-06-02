package TesteDIO12;

public class Principal {
    
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(21,"Douglas",1000.0);
        ContaPoupanca cPoupanca = new ContaPoupanca(21,"Douglas",1000.0);

        System.out.println("Conta Corrente: "+cc.getSaldo()+" rendimento: " +cc.rendimento());
        System.out.println("Conta Poupança: "+cPoupanca.getSaldo()+" rendimento: "+cPoupanca.rendimento());
    }
}
