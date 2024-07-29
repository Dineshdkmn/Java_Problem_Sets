package pset3;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayElements {
	
	public static void sortingArray(int[] array) {
        int mid = array.length / 2;
        Arrays.sort(array, 0, mid);
        Arrays.sort(array, mid, array.length);
        reverse(array, mid, array.length - 1);
    }
	
	public static int[] reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of the array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sortingArray(arr);
		System.out.println("Array after sorting:"+Arrays.toString(arr));
		sc.close();
	}
}
