package pset1;

import java.util.Scanner;

public class FriendlyPair {
	public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
	public static boolean isFriendly(int num1, int num2) {
        int sum1 = sumOfProperDivisors(num1);
        int sum2 = sumOfProperDivisors(num2);
        return (sum1 == num2) && (sum2 == num1);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		if(isFriendly(num1,num2)) {
			 System.out.println(num1 + " and " + num2 + " are a friendly pair.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not a friendly pair.");
        }
		sc.close();
	}
}
