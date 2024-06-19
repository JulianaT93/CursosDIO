import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta bancária:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência bancária:");
        String agencia = scanner.next();

        System.out.println("Digite o nome completo:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo bancário:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e o seu saldo de R$" + saldo
                + " já está disponível para saque.");
    }
}
