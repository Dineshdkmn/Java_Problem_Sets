package pset2;

import java.util.Scanner;

public class LCM {
	public static int findGCD(int a, int b) {
		int gcd=1;
		for(int i=1;i<=a&&i<=b;++i) {
			if(a%2==0 && b%2==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	public static int findLCM(int a, int b) {
		int lcm=(a*b)/findGCD(a,b);
		return lcm;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		int lcm=findLCM(num1,num2);
		System.out.println("The lcm of "+num1+" and "+num2+" is: "+lcm);
		sc.close();

	}

}
