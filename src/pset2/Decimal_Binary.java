package pset2;

import java.util.Scanner;

public class Decimal_Binary {
	public static String decimalToBinary(int n) {
		String c="";
		while(n>0) {
			int rem=n%2;
			c=rem+c;
			n/=2;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal value: ");
		int n=sc.nextInt();
		String result=decimalToBinary(n);
		System.out.println("The binary value for the given decimal value "+n+" is: "+result);
		sc.close();
	}
}
