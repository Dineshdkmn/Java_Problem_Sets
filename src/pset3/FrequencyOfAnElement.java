package pset3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfAnElement {
    public static void getOccurrence(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int data : arr) {
            map.put(data, map.getOrDefault(data, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
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
        getOccurrence(arr);
        sc.close();
    }
}
