package pset3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SymmetricPairs {
    public static void findSymmetricPairs(int[][] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        System.out.println("Symmetric pairs are:");
        for (int[] pair : arr) {
            int first = pair[0];
            int second = pair[1];

            if (map.containsKey(second) && map.get(second) == first) {
                System.out.println("(" + second + ", " + first + ")");
            } else {
                map.put(first, second);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of pairs in the array: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        System.out.println("Enter the pairs:");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        findSymmetricPairs(arr);
        sc.close();
    }
}

