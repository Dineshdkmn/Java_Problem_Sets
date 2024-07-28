package pset1;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int num) {
		if(num<=1) return false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check if it is a prime or not:");
		int num=sc.nextInt();
		if(isPrime(num)) {
			System.out.println("The given number "+num+" is a prime number.");
		} else {
			System.out.println("The given number "+num+" is not a prime number.");
		}
		sc.close();
	}

}
