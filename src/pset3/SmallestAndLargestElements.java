package pset3;

import java.util.Scanner;

public class SmallestAndLargestElements {
	public static int[] findSmallestAndLargestElement(int[] array) {
        int min = array[0]; 
        int max = array[0]; 
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return new int[]{min, max};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] result = findSmallestAndLargestElement(array);

        System.out.println("The smallest element in the array is: " + result[0]);
        System.out.println("The largest element in the array is: " + result[1]);
        sc.close();
    }
}
