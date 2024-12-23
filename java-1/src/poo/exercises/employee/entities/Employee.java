package poo.exercises.employee.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public String toString() {
        return String.format("%s, $%.2f%n", name, netSalary());
    }

    public void increaseSalary(double increasePercent) {
        this.grossSalary += (this.grossSalary / 100 * increasePercent);
    }
}
