package pset3;

import java.util.Scanner;

public class RotationOfArrayElements {
	
	 public static int[] rotateLeft(int[] array, int positions) {
	        int n = array.length;
	        positions = positions % n; 
	        int[] rotatedArray = new int[n];

	        for (int i = 0; i < n; i++) {
	            rotatedArray[i] = array[(i + positions) % n];
	        }

	        return rotatedArray;
	    }

	    public static int[] rotateRight(int[] array, int positions) {
	        int n = array.length;
	        positions = positions % n; 
	        int[] rotatedArray = new int[n];

	        for (int i = 0; i < n; i++) {
	            rotatedArray[i] = array[(i - positions + n) % n];
	        }

	        return rotatedArray;
	    }

	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
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

        System.out.print("Enter the number of positions to rotate: ");
        int positions = sc.nextInt();
        
        int[] leftRotatedArray = rotateLeft(array, positions);
        System.out.println("Array after left rotation:");
        printArray(leftRotatedArray);

        int[] rightRotatedArray = rotateRight(array, positions);
        System.out.println("Array after right rotation:");
        printArray(rightRotatedArray);

        sc.close();
    }

}

