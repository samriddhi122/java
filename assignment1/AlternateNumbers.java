package assignment1;

import java.util.Scanner;

public class AlternateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Alternate numbers:");
        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

