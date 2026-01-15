public class WhileLoops {
    public static void main(String[] args) {

        int count = 1;

        // Loop runs while condition is true
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++; // increase count to avoid infinite loop
        }
    }
}
