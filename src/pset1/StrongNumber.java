package pset1;

import java.util.Scanner;

public class StrongNumber {
	static int sum=0;
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static int isStrong(int num) {
		while(num!=0) {
			int digit=num%10;
			sum+=fact(digit);
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int result=StrongNumber.isStrong(num);
		if(result==num) {
			System.out.println(num+" is a strong number.");
		} else {
			System.out.println(num+" is not a strong number.");
		}
		sc.close();
	}
}
