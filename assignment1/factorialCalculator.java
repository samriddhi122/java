package assignment1;

public class factorialCalculator {
    public static void main(String[] args) {
        int number = 12; 
        long factorial = 1; 

        for (int i = 1; i <= number; i++) {
            factorial *= i; 
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
