package pset2;

import java.util.Scanner;

public class Number_Of_Digits {

	static int count =0;
	public static int countOfDigits(int num) {
		while(num>0) {
			int rem = num%10;
			num = num/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit:");
		int digit=sc.nextInt();
		int result=countOfDigits(digit);
		System.out.println("The count of the givin digit is:"+result);
		sc.close();
	}

}
