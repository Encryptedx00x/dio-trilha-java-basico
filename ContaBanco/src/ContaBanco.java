import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta:");
        String conta = scanner.next();

        System.out.println("Por favor, digite o valor do saldo para saque:");
        double numeroSaldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + numeroSaldo + " já está disponível para saque.");

        scanner.close();
    }
}
