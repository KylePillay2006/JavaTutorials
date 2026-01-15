public class Substrings {
    public static void main(String[] args) {

        String email = "kyle@gmail.com";

        // Extract username before @
        String username = email.substring(0, email.indexOf("@"));

        System.out.println("Username: " + username);
    }
}
