package assignment1;

import java.util.Scanner;

public class MilesToKilometersConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.60934;

        System.out.println("Equivalent distance in kilometers: " + kilometers);
        scanner.close();
    }
    
}

