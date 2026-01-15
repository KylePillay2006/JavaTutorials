public class LogicalOperators {
    public static void main(String[] args) {

        int age = 20;
        boolean hasLicense = true;

        // AND (&&)
        if (age >= 18 && hasLicense) {
            System.out.println("You can drive.");
        }

        // OR (||)
        if (age < 18 || !hasLicense) {
            System.out.println("You cannot drive.");
        }
    }
}
