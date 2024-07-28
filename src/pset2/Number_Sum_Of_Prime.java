package pset2;

import java.util.Scanner;

public class Number_Sum_Of_Prime {

	 public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void expressAsSumOfTwoPrimes(int number) {
	        boolean found = false;
	        for (int i = 2; i <= number / 2; i++) {
	            if (isPrime(i) && isPrime(number - i)) {
	                System.out.println(number + " can be expressed as the sum of " + i + " and " + (number - i));
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
	        }
	    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number: ");
	        int number = sc.nextInt(); 
	        expressAsSumOfTwoPrimes(number);
	        sc.close();
	    }

}
