package pset3;

import java.util.Scanner;

public class Largest_Element_In_Array {
	public static int findLargestElement(int[] array) {
        int max = array[0]; 
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
	public static void main(String[] args) {
//        int[] array = {12, 45, 67, 23, 89, 34, 90, 24, 56};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of the array: ");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
        int largest = findLargestElement(array);

        System.out.println("The largest element in the array is: " + largest);
        sc.close();
    }

}
