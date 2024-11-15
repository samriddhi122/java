package assignment1;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements and their frequencies:");
        for (int key : frequency.keySet()) {
            if (frequency.get(key) > 1) {
                System.out.println(key + ": " + frequency.get(key));
            }
        }
    }
}

