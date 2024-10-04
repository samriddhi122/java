package assignment1;

import java.util.Scanner;

public class MultiplesOfTenPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the interval: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the interval: ");
        int upperBound = scanner.nextInt();

        System.out.println("Multiples of 10 between " + lowerBound + " and " + upperBound + ":");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
        scanner.close();
    }
}
