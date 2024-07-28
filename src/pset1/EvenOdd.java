package pset1;

import java.util.Scanner;

public class EvenOdd {
	public static void isEven(int num) {
		if(num%2==0) {
			System.out.println("The given number is even.");
		} else {
			System.out.println("The given number is odd.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		EvenOdd.isEven(num);
		sc.close();
	}

}
