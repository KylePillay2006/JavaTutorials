import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        // Creating a funny sentence
        System.out.println("Today I saw a " + adjective + " " + noun + " that loves to " + verb + "!");

        scanner.close();
    }
}
