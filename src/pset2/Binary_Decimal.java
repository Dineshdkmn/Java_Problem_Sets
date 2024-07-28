package pset2;

import java.util.Scanner;

public class Binary_Decimal {
	public static int binaryToDecimal(int n) {
		int base=1;
		int decimal=0;
		while(n!=0) {
			int rem=n%10;
			n/=10;
			decimal+=base*rem;
			base*=2;
		}
		return decimal;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number:");
		int n=sc.nextInt();
		int result=binaryToDecimal(n);
		System.out.println("The decimal value for the given binary number "+n+" is: "+result);
		sc.close();

	}

}
