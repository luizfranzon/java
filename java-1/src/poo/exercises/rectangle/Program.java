package poo.exercises.rectangle;

import poo.exercises.rectangle.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Entre a largura e a altura do retangulo: ");

        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.println("AREA = " + rectangle.area());
        System.out.println("PERIMETER = " + rectangle.perimeter());
        System.out.println("DIAGONAL = " + rectangle.diagonal());

        scanner.close();
    }
}
