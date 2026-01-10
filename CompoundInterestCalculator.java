import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = scanner.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // Compound interest formula
        double amount = principal * Math.pow(1 + rate, years);

        System.out.println("Final amount after " + years + " years: R" + amount);

        scanner.close();
    }
}
