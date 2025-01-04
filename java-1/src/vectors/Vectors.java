package vectors;

import java.util.Locale;
import java.util.Scanner;

public class Vectors {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int vectorSize = 3;
        double[] heightVectors = new double[vectorSize];


        for (int i = 0; i < vectorSize; i++) {
            double typedHeight = scanner.nextDouble();
            heightVectors[i] = typedHeight;
        }

        double heightAverage = calculateHeightAverage(heightVectors);

        System.out.printf("Average height: %.2f%n", heightAverage);

        scanner.close();
    }

    public static double calculateHeightAverage(double[] heightVectors) {
        double total = 0.00;

        for (double heightVector : heightVectors) {
            total += heightVector;
        }

        return total / heightVectors.length;
    }
}
