package pset3;

import java.util.Scanner;

public class SumOfElements {

	static int sum=0;
	public static int sum(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of the array: ");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		 int result=sum(array);
		 System.out.println("The sum of the given array elements is:"+result);
		 sc.close();
	}

}
