package pset1;

import java.util.Scanner;

public class ArmstrongNumber {
	static int temp=0;
	static int rem=0;
	static int result=0;
	public static void Armstrong(int num) {
		temp=num;
		while(temp!=0) {
			rem=temp%10;
			result+=Math.pow(rem,3);
			temp/=10;
		}
		if(result==num) {
			System.out.println(num+" is a armstrong number.");
		} else {
			System.out.println(num+" is not a armstrong number.");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		ArmstrongNumber.Armstrong(num);
		sc.close();
	}
}
