package TesteDIO12;

public class ContaPoupanca extends Conta{
 
    public ContaPoupanca(Integer numero, String titular, Double saldo) {
        super(numero, titular, saldo);
    }

    public double rendimento(){
        
        return getSaldo() * 0.07;
    }
}
