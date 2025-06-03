// Importing built-in Java utilities
import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        System.out.println("Hello, Jenkins CI/CD!");

        // Example usage of imported Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "!");
    }
}
