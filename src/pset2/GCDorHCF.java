package pset2;

import java.util.Scanner;

public class GCDorHCF {
	public static int findGCD(int a, int b) {
//		while(b!=0) {
//			int temp=b;
//			b=a%b;
//			a=temp;
//		}
//		return a;
		int gcd=1;
		for(int i=1;i<=a&&i<=b;++i) {
			if(a%2==0 && b%2==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		int gcd=findGCD(num1,num2);
		System.out.println("The gcd of "+num1+" and "+num2+" is: "+gcd);
		sc.close();
	}

}
