package pset1;

import java.util.Scanner;

public class ReverseOfNumber {
	static int rem=0;
	static int reverse=0;
	public static int reverse(int num) {
		while(num>0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed:");
		int num=sc.nextInt();
		int result=reverse(num);
		System.out.println("The reverse of the given number is:"+result);
		sc.close();
	}

}
