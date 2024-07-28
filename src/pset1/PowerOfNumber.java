package pset1;

import java.util.Scanner;

public class PowerOfNumber {
	public static int power(int m, int n) {
		int pow=1;
		if(n==0) return 1;
		for(int i=1;i<=n;i++) {
			pow=pow*m;
		}
		return pow;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value:");
		int base=sc.nextInt();
		System.out.println("Enter the exponent value:");
		int exp=sc.nextInt();
		System.out.println("The power of the given value is:"+power(base, exp));
		sc.close();
	}
}
