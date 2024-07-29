package pset3;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SecondSmallestElement {
	public static void findSecondSmallest(int[] arr) {
		int count=1;
		int k=2;
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		while(count<=k) {   
			int element=pq.poll();
			if(count==k) {
				System.out.println("The second smallest element in the gven array is: "+element);
				break;
			}
			count++;
		}
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
        findSecondSmallest(array);
        sc.close();

	}

}
