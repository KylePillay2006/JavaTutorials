public class NestedIfStatements {
    public static void main(String[] args) {

        int age = 18;
        boolean hasID = true;

        // Nested if checks another condition inside an if
        if (age >= 18) {
            if (hasID) {
                System.out.println("You are allowed to enter.");
            } else {
                System.out.println("You need an ID to enter.");
            }
        } else {
            System.out.println("You are too young to enter.");
        }
    }
}
