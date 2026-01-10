import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        // Generate random number between 1 and 10
        int number = random.nextInt(10) + 1;

        System.out.println("Random number: " + number);
    }
}
