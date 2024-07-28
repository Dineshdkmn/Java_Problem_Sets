package pset1;

import java.util.Scanner;

public class SumOfFirstN {
	static int sum=0;
	public static void sum(int num) {
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of first "+num+"  natural numbers is: "+ sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of N to sum the natural numbers:");
		int num=sc.nextInt();
		SumOfFirstN.sum(num);
		sc.close();
	}

}
