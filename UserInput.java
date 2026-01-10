import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // Scanner allows us to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old!");

        scanner.close(); // Always close Scanner
    }
}
