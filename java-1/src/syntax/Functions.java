package syntax;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        System.out.println("Insira 3 números: ");
        int firstNumber = scannner.nextInt();
        int secondNumber = scannner.nextInt();
        int thirdNumber = scannner.nextInt();

        int biggestNumber = maxNumber(firstNumber, secondNumber, thirdNumber);

        System.out.println("Maior número: " + biggestNumber);
    }

    public static int maxNumber(int n1, int n2, int n3) {

        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n3) {
            return n2;
        } else {
            return n3;
        }

    }
}
