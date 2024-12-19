import java.util.Scanner;

public class UsersScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite a idade: ");
        int age = scanner.nextInt();

        System.out.println("\nNome digitado: " + name);
        System.out.println("Idade digitada: " + age);

        if (age >= 18) {
            System.out.println("-- Maior de idade!");
        } else {
            System.out.println("-- Menor de idade!");
        }

        switch (name.toLowerCase()) {
            case "luiz":
                System.out.println("\npqp gay pra caralho");
                break;
            case "eduardo":
                System.out.println("Fernanda Clapper");
                break;
            case "andré":
                System.out.println("muito gato pqp, casa comigo (lá ele)"); //é meme eu não sou gay!
                break;
            default:
                System.out.println("Não sei quem é");
                break;
        }

        scanner.close();
    }
}
