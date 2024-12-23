package datatypes;

public class Conditions {
    public static void main(String[] args) {

        String[] peopleList = {"Luiz", "Pedro", "Andrézito"};
        int[] peopleAge = {21, 23, 22};

        PrintNames(peopleList);

        int Age = 60;

        if (Age < 18) {
            System.out.println("Menor de idade");
        } else if (Age < 60) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Idoso"); //
        }
    }

    public static void PrintNames(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
