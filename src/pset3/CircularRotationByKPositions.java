package pset3;

import java.util.Scanner;

public class CircularRotationByKPositions {
	
	public static int[] circularRotateLeft(int[] array, int positions) {
        int n = array.length;
        positions = positions % n; 
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedArray[i] = array[(i + positions) % n];
        }

        return rotatedArray;
    }

    public static int[] circularRotateRight(int[] array, int positions) {
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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of positions to rotate: ");
        int positions = scanner.nextInt();

        int[] leftRotatedArray = circularRotateLeft(array, positions);
        System.out.println("Array after left circular rotation:");
        printArray(leftRotatedArray);

        int[] rightRotatedArray = circularRotateRight(array, positions);
        System.out.println("Array after right circular rotation:");
        printArray(rightRotatedArray);

        scanner.close();
    }

}

