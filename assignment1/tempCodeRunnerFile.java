package assignment1;

import java.util.Scanner;

// Commission class with an instance variable, constructor, and commission calculation method
class Commission {
    private double sales;

    // Constructor to initialize sales
    public Commission(double sales) {
        this.sales = sales;
    }

    // Method to calculate and return commission based on sales
    public double commission() {
        if (sales < 5000) {
            return sales * 0.02;
        } else if (sales <= 10000) {
            return sales * 0.05;
        } else {
            return sales * 0.1;
        }
    }
}

// Demo class to test the Commission class
public class CommissionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sales amount: ");
        double sales = sc.nextDouble();

        // Validate that the sales amount is not negative
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            // Create a Commission object and calculate commission
            Commission commissionObj = new Commission(sales);
            double commission = commissionObj.commission();
            System.out.println("Commission: " + commission);
        }
    }
}

