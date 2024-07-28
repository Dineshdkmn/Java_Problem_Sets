package pset1;

import java.util.Scanner;

public class Fibonacci2 {
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth term of fibonacci number:");
		int n=sc.nextInt();
		System.out.println("The " + n + "th Fibonacci number is:"+fibonacci(n));
		sc.close();
	}

}
