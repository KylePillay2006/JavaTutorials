import java.util.Scanner;

public class WeightConverterProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double kg = scanner.nextDouble();

        // Convert kg to pounds
        double pounds = kg * 2.20462;

        System.out.println("Weight in pounds: " + pounds);

        scanner.close();
    }
}
