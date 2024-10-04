package assignment2;

// Base class Num
class Num {
    int number;

    // Constructor to initialize the number
    Num(int number) {
        this.number = number;
    }

    // Method to display the number
    void shownum() {
        System.out.println("Number: " + number);
    }
}

// Derived class HexNum
class HexNum extends Num {

    // Constructor to initialize the number
    HexNum(int number) {
        super(number);
    }

    // Overriding the shownum() method to display hexadecimal and octal values
    @Override
    void shownum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

// Main class to demonstrate the working of the classes
public class Main11 {
    public static void main(String[] args) {
        // Creating an object of the base class Num
        Num num = new Num(255);
        num.shownum(); // Displays the number

        // Creating an object of the derived class HexNum
        HexNum hexNum = new HexNum(255);
        hexNum.shownum(); // Displays the number in hexadecimal and octal formats
    }
}

