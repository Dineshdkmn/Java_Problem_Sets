package pset1;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void factorial(int n) {
		int i;
		int fact=1;
		for(i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("The factorial of "+n+" is: "+fact);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to find factorial:");
		int n=sc.nextInt();
		factorial(n);
		sc.close();
	}
}
