package pset1;

import java.util.Scanner;

public class AbundantNumber {
	public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
	 public static boolean isAbundantNumber(int num) {
	        if (num <= 0) {
	            return false;
	        }
	        
	        int sumOfDivisors = sumOfProperDivisors(num);
	        return sumOfDivisors > num;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if (isAbundantNumber(num)) {
            System.out.println(num + " is an abundant number.");
        } else {
            System.out.println(num + " is not an abundant number.");
        }
		sc.close();
	}
}
