package poo.exercises.third.entities;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public double calculateFinalGrade() {
        return firstGrade + secondGrade + thirdGrade;
    }

    public boolean checkIfIsApproved() {
        double finalGrade = calculateFinalGrade();

        return finalGrade >= 60;
    }
}
