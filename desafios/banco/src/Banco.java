public class Banco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("12345", 500.0);
        ContaPoupanca cp = new ContaPoupanca("67890", 0.01);
        
        cc.depositar(1000.0);
        cp.depositar(2000.0);
        
        cc.sacar(1100.0);
        cp.aplicarJuros();
        
        cc.transferir(cp, 300.0);
        
        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());
    }
}
