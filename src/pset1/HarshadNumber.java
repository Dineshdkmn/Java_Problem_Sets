package pset1;

import java.util.Scanner;

public class HarshadNumber {
	public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
	public static boolean isHarshad(int num) {
        if (num <= 0) {
            return false;
        }
        int sumOfDigits = sumDigits(num);
        return num % sumOfDigits == 0;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(isHarshad(num)) {
			System.out.println(num+" is a harshad number.");
		} else {
			System.out.println(num+" is not a harshad number.");
		}
		sc.close();
	}

}
