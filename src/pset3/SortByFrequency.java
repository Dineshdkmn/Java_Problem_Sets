package pset3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortByFrequency {
	
    public static int[] sortArrayByFrequency(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<int[]> frequencyList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            frequencyList.add(new int[]{entry.getKey(), entry.getValue()});
        }

        frequencyList.sort((a, b) -> {
            if (a[1] != b[1]) {
                return b[1] - a[1]; 
            } else {
                return a[0] - b[0]; 
            }
        });

        int[] sortedArray = new int[array.length];
        int index = 0;
        for (int[] pair : frequencyList) {
            int value = pair[0];
            int frequency = pair[1];
            for (int i = 0; i < frequency; i++) {
                sortedArray[index++] = value;
            }
        }

        return sortedArray;
    }
    
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] array = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        int[] sortedArray = sortArrayByFrequency(array);

	        System.out.println("Sorted array by frequency:");
	        System.out.println(Arrays.toString(sortedArray));

	        scanner.close();
	    }
}
