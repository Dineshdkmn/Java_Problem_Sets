package pset3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubsetOfArray {
	
	 public static boolean isSubset(int[] mainArray, int[] subsetArray) {
		 Map<Integer, Integer> elementCountMap = new HashMap<>();
	        for (int num : mainArray) {
	            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
	        }

	        for (int num : subsetArray) {
	            if (!elementCountMap.containsKey(num) || elementCountMap.get(num) == 0) {
	                return false; 
	            } else {
	                elementCountMap.put(num, elementCountMap.get(num) - 1); 
	            }
	        }


	        return true;
	    }
	 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements of array1:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the array2: ");
        int p = sc.nextInt();
        int[] arr2 = new int[p];
        System.out.println("Enter elements of the array2:");
        for (int i = 0; i < p; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean isSubset = isSubset(arr1, arr2);

        if (isSubset) {
            System.out.println("The array2 is a subset of the array1.");
        } else {
            System.out.println("The array2 is not a subset of the array1.");
        }

        sc.close();
    }

}

