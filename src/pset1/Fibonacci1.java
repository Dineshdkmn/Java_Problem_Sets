package pset1;

import java.util.Scanner;

public class Fibonacci1 {
	static int n1=0, n2=1, n3=0;
	public static void fibonacci(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=sc.nextInt();
		fibonacci(n);
	}
}
