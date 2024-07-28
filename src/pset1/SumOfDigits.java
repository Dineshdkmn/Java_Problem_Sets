package pset1;

import java.util.Scanner;

public class SumOfDigits {
	static int sum=0;
	public static int sumOfDigits(int num) {
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int result=sumOfDigits(num);
		System.out.println("The sum of the given digits is:"+result);
		sc.close();
	}

}
