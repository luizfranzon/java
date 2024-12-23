package poo.store;

import poo.store.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = scanner.nextLine();

        System.out.print("Price: ");
        product.price = scanner.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = scanner.nextInt();

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
