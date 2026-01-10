import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String item = scanner.nextLine();

        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Calculate total cost
        double total = price * quantity;

        System.out.println("\n--- RECEIPT ---");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: R" + total);

        scanner.close();
    }
}
