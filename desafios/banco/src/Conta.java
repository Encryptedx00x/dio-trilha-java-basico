public abstract class Conta {
    private String numero;
    private double saldo;
    
    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
    
    public void transferir(Conta destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " para a conta " + destino.getNumero() + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }
}
