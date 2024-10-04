package assignment2;

import java.util.Scanner;

// Custom exception class
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class PersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input name and age
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            // Check if age is negative
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            }
            System.out.println("Name: " + name + ", Age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

