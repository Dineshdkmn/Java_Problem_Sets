package pset2;

import java.util.Scanner;

public class Number_Occurrance {

	public static int countDigitOccurrences(String number, char x) {
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            char currentChar = number.charAt(i);
            if (currentChar == x) {
                count++;
            }
        }

        return count;
    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number: ");
	        String number = sc.next();
	        System.out.println("Enter the digit to find its occurrance:");
	        char digit = sc.next().charAt(0);

	        int occurrences = countDigitOccurrences(number, digit);
	        System.out.println("The digit " + digit + " occurs " + occurrences + " times in the number " + number);
	        sc.close();
	    }

}
