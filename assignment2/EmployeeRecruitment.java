package assignment2;
import java.util.Scanner;

// Custom exception for age greater than 45
class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

// Custom exception for age less than 20
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class EmployeeRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking candidate name and age as input
        System.out.print("Enter candidate name: ");
        String name = scanner.nextLine();
        System.out.print("Enter candidate age: ");
        int age = scanner.nextInt();

        try {
            // Checking age criteria
            if (age > 45) {
                throw new TooOlder("Candidate is too old.");
            } else if (age < 20) {
                throw new TooYounger("Candidate is too young.");
            } else {
                System.out.println("Eligible");
                System.out.println("Candidate Name: " + name);
            }
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

