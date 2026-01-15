public class StringMethods {
    public static void main(String[] args) {

        String name = "Kyle Pillay";

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Contains 'Kyle': " + name.contains("Kyle"));
        System.out.println("Replace: " + name.replace("Kyle", "Student"));
    }
}
