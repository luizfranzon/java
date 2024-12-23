package poo.exercises.employee;

import poo.exercises.employee.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.print("Gross Salary: ");
        employee.grossSalary = scanner.nextDouble();

        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println("\nEmployee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(scanner.nextDouble());

        System.out.println("\nUpdated data: " + employee);

        scanner.close();
    }
}
