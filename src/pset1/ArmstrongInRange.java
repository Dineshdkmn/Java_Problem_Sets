package pset1;

import java.util.Scanner;

public class ArmstrongInRange {

	public static void printArmstrong(int m, int n) {
		for(int i=m;i<=n;i++) {
			int sum=0;
			int length=getLength(i);
			int temp=i;
			while(temp>0) {
				int rem=temp%10;
				temp=temp/10;
				sum+=Math.pow(rem, length);
			}
			if(i==sum) {
				System.out.println(i);
			}
		}
	}
	public static int getLength(int num) {
		int count=0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start value(m) of the range:");
		int start=sc.nextInt();
		System.out.println("Enter the end value(n) of the range:");
		int end=sc.nextInt();
		ArmstrongInRange.printArmstrong(start, end);
		sc.close();
	}

}
