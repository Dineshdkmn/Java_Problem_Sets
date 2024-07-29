package pset3;

import java.util.Scanner;

public class EqualNumberArray {
	
	 public static boolean canAllNumbersBeMadeEqual(int[] array) {
	        if (array.length == 0) return true;

	        int minElement = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < minElement) {
	                minElement = array[i];
	            }
	        }

	        int gcdValue = 0;
	        for (int i = 0; i < array.length; i++) {
	            gcdValue = gcd(gcdValue, array[i] - minElement);
	            if (gcdValue == 1) {
	                return true;
	            }
	        }

	        return gcdValue == 1;
	    }

	    public static int gcd(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return gcd(b, a % b);
	    }
	    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        boolean result = canAllNumbersBeMadeEqual(array);

        if (result) {
            System.out.println("All elements of the array can be made equal.");
        } else {
            System.out.println("All elements of the array cannot be made equal.");
        }

        sc.close();
    }

}
