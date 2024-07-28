package pset2;

import java.util.Scanner;

public class Octal_Decimal {
	public static int octalToDecimal(int n) {
		int base=1;
		int decimal=0;
		while(n!=0) {
			int rem=n%10;
			n/=10;
			decimal+=base*rem;
			base*=8;
		}
		return decimal;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the octal number:");
		int n=sc.nextInt();
		int result=octalToDecimal(n);
		System.out.println("The decimal value for the given octal number "+n+" is: "+result);
		sc.close();
	}

}
