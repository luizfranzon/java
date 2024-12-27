package contructors.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double initialDepositAmmount = 0.00;

        System.out.println("Cadastro de conta:");
        System.out.print("Insira o nome: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Deseja efetuar um deposito inicial? (y/n)");
        char isGonnaMakeInitialDeposit = scanner.nextLine().toLowerCase().charAt(0);

        if (isGonnaMakeInitialDeposit == 'y') {
            initialDepositAmmount = scanner.nextDouble();
        }

        Account account = new Account(accountHolderName, initialDepositAmmount);

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Insira um valor para depósito: ");
        account.depositAmmount(scanner.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Insira um valor para retirar: ");
        account.withdrawAmmount(scanner.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account);
    }
}
