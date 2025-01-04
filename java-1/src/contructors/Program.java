package contructors;


import contructors.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = scanner.nextInt();

        product.setName(name);
        System.out.println("Nome do produto: " + product.getName());

        System.out.println("\nProduct data: " + product);

        System.out.print("Enter the amount of product to be added in stock: ");
        product.addProducts(scanner.nextInt());

        System.out.println("\nUpdated data: " + product);

        System.out.print("Enter the amount of product to be removed from stock: ");
        product.removeProducts(scanner.nextInt());

        System.out.println("\nUpdated data: " + product);

        scanner.close();
    }
}
