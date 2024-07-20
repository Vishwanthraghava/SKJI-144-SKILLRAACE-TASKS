import java.util.Scanner;

public class TASK_1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        // Determine if the person is allowed or not allowed to take certain rides
        if (age < 15 || age > 60) {
            System.out.println("Not Allowed");
        } else {
            System.out.println("Allowed");
        }
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

