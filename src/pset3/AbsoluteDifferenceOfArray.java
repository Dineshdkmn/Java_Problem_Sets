package pset3;

import java.util.Arrays;
import java.util.Scanner;

public class AbsoluteDifferenceOfArray {
	
	 public static int findMinSum(int[] array) {
	     Arrays.sort(array);
	     int median = array[array.length / 2];

	     int sum = 0;
	     for (int num : array) {
	         sum += Math.abs(num - median);
	     }

	     return sum;
	 }
	 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }

        int minSum = findMinSum(array);
        
        System.out.println("The minimum sum of absolute differences is: " + minSum);

        sc.close();
    }

}

