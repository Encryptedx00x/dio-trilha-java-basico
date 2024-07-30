public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;
    
    public ContaCorrente(String numero, double limiteChequeEspecial) {
        super(numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
    @Override
    public void sacar(double valor) {
        if (valor > 0 && (getSaldo() + limiteChequeEspecial) >= valor) {
            double saldoAtual = getSaldo();
            if (saldoAtual >= valor) {
                super.sacar(valor);
            } else {
                double restante = valor - saldoAtual;
                super.sacar(saldoAtual);
                limiteChequeEspecial -= restante;
                System.out.println("Utilizado cheque especial de " + restante);
            }
        } else {
            System.out.println("Saldo insuficiente, mesmo com cheque especial, ou valor de saque inválido.");
        }
    }
}
