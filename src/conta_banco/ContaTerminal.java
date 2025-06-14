package conta_banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        Double agencia = scanner.nextDouble();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco. Sua agência é " + 
            agencia + ", conta " + numero + " e seu saldo " + saldo + 
            " já está disponível para saque.");

    }
}