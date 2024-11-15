package assignment1;

import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        String[] names = new String[n];
        int[] mathMarks = new int[n];
        int[] physicsMarks = new int[n];
        int[] chemistryMarks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.next();
            System.out.print("Mathematics marks: ");
            mathMarks[i] = scanner.nextInt();
            System.out.print("Physics marks: ");
            physicsMarks[i] = scanner.nextInt();
            System.out.print("Chemistry marks: ");
            chemistryMarks[i] = scanner.nextInt();
        }

        System.out.println("\nEligible candidates:");
        for (int i = 0; i < n; i++) {
            int totalMarks = mathMarks[i] + physicsMarks[i] + chemistryMarks[i];
            int mathPhysicsTotal = mathMarks[i] + physicsMarks[i];

            if ((mathMarks[i] >= 60 && physicsMarks[i] >= 50 && chemistryMarks[i] >= 40 && totalMarks >= 200) ||
                (mathMarks[i] >= 60 && physicsMarks[i] >= 50 && mathPhysicsTotal >= 150)) {
                System.out.println(names[i]);
            }
        }

        scanner.close();
    }
}
