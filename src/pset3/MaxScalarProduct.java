package pset3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxScalarProduct {
    public static long maxScalarProduct(int[] vector1, int[] vector2) {
        Arrays.sort(vector1);
        Arrays.sort(vector2);
        long scalarProduct = 0;
        for (int i = 0; i < vector1.length; i++) {
            scalarProduct += (long) vector1[i] * vector2[i];
        }

        return scalarProduct;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the vectors: ");
        int n = sc.nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        System.out.println("Enter the elements of the first vector: ");
        for (int i = 0; i < n; i++) {
            vector1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the second vector: ");
        for (int i = 0; i < n; i++) {
            vector2[i] = sc.nextInt();
        }

        long maxProduct = maxScalarProduct(vector1, vector2);

        System.out.println("The maximum scalar product of the two vectors is: " + maxProduct);

        sc.close();
    }
}

