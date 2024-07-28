package pset1;

import java.util.Scanner;

public class FactorOfNumber {
	public static void factor(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void factor1(int n) {
		if(n==0) {
			return;
		}
		for(int i=n;i<=Math.abs(n);i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for which you want to find the factors:");
		int num=sc.nextInt();
		if(num>0) {
			factor(num);
		} else {
			factor1(num);
		}
		sc.close();
	}
}
