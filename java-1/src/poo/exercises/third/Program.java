package poo.exercises.third;

import poo.exercises.third.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        double finalGrade;

        System.out.print("Nome: ");
        student.name = scanner.nextLine();

        System.out.print("Nota do primeiro trimestre: ");
        student.firstGrade = scanner.nextDouble();

        System.out.print("Nota do segundo trimestre: ");
        student.secondGrade = scanner.nextDouble();

        System.out.print("Nota do terceiro trimestre: ");
        student.thirdGrade = scanner.nextDouble();

        finalGrade = student.calculateFinalGrade();

        System.out.println("\nNOTA FINAL = " + finalGrade);

        if (student.checkIfIsApproved()) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
            System.out.println("Faltou " + (60 - finalGrade) + " pontos.");
        }

        scanner.close();
    }
}
