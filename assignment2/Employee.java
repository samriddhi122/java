package assignment2;

import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;

    // Method to accept employee details
    void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        emp_id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        emp_name = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic_salary = scanner.nextDouble();
    }

    // Method to calculate gross salary
    void calculateGrossSalary() {
        double da = 0.3 * basic_salary; // Dearness Allowance is 30% of basic salary
        double hra = 0.15 * basic_salary; // House Rent Allowance is 15% of basic salary
        gross_salary = basic_salary + da + hra;
    }

    // Method to display employee details and gross salary
    void displayDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.acceptDetails();
        emp.calculateGrossSalary();
        emp.displayDetails();
    }
}
