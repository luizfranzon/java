package vectors;

import vectors.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Vectors2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0.00;
        System.out.print("Enter product quantity: ");
        int productsQuantity = scanner.nextInt();
        scanner.nextLine();

        Product[] productsList = new Product[productsQuantity];

        for (int i = 0; i < productsQuantity; i++) {
            System.out.print("\nEnter the product name: ");
            String typedProductName = scanner.nextLine();

            System.out.print("Enter the product price: ");
            double typedProductPrice = scanner.nextDouble();
            scanner.nextLine();

            Product newProduct = new Product(typedProductName, typedProductPrice);
            productsList[i] = newProduct;
        }

        for (Product product : productsList) {
            totalPrice += product.getPrice();
        }

        System.out.printf("\nTotal price average: %.2f", totalPrice / productsQuantity);

        scanner.close();
    }
}