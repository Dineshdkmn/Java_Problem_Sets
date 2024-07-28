package pset1;

import java.util.Scanner;

public class PositiveNegative {
	public static void checkType(int num) {
		if(num==0) {
			System.out.println("The given number is neither positive nor negative");
		} else if(num>0) {
			System.out.println("The given number is positive");
		} else {
			System.out.println("The given number is negative"); 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		PositiveNegative.checkType(num);
		sc.close();
	}

}
