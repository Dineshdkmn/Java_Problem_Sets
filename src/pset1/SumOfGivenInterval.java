package pset1;

import java.util.Scanner;

public class SumOfGivenInterval {
	public static void sumOfRange(int num1, int num2) {
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			sum+=i;
		}
		System.out.println("the sum of numbers between "+num1+" and "+num2+" is:"+ sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start value of the range:");
		int start=sc.nextInt();
		System.out.println("Enter the end value of the range:");
		int end = sc.nextInt();
		SumOfGivenInterval.sumOfRange(start, end);
		sc.close();
	}

}
