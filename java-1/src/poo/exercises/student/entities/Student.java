package poo.exercises.student.entities;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;
    private double cuttofGrade = 60.00;

    public double calculateFinalGrade() {
        return firstGrade + secondGrade + thirdGrade;
    }

    public boolean checkIfIsApproved() {
        double finalGrade = calculateFinalGrade();

        return finalGrade >= cuttofGrade;
    }

    public double calculateMissingPoints() {
        return cuttofGrade - calculateFinalGrade();
    }
}
