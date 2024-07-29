package pset3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfAnArray {
	public static int[] reverseArray(int[] arr, int n) {
		int i=0;
		int j=n-1;
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
		System.out.println(Arrays.toString(reverseArray(arr, arr.length)));
		sc.close();
	}
}
