package pset3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatingElements {
    public static void findRepeatingElements(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int data : arr) {
            map.put(data, map.getOrDefault(data, 0) + 1);
        }

        System.out.println("Repeating elements in the array:");
        boolean hasRepeatingElements = false;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
                hasRepeatingElements = true;
            }
        }

        if (!hasRepeatingElements) {
            System.out.println("No repeating elements found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findRepeatingElements(arr);
        sc.close();
    }
}

