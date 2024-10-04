package assignment2;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // This will generate NegativeArrayIndexException
            int[] array = new int[5];
            System.out.println(array[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // This will generate ArithmeticException
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}

