package pset2;

import java.util.Scanner;

public class DigitsToWords {

	private static final String[] units = {
	        "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
	        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
	    };

	    private static final String[] tens = {
	        "",   
	        "",        
	        "Twenty", 
	        "Thirty", 
	        "Forty",  
	        "Fifty", 
	        "Sixty", 
	        "Seventy", 
	        "Eighty",  
	        "Ninety"   
	    };

	    // Method to convert a number to words
	    public static String convertToWords(int number) {
	        if (number == 0) {
	            return units[0];
	        }

	        return convert(number);
	    }

	    private static String convert(int number) {
	        if (number < 20) {
	            return units[number];
	        }

	        if (number < 100) {
	            return tens[number / 10] + (number % 10 != 0 ? " " + units[number % 10] : "");
	        }

	        if (number < 1000) {
	            return units[number / 100] + " Hundred" + (number % 100 != 0 ? " and " + convert(number % 100) : "");
	        }

	        if (number < 1000000) {
	            return convert(number / 1000) + " Thousand" + (number % 1000 != 0 ? " " + convert(number % 1000) : "");
	        }

	        if (number < 1000000000) {
	            return convert(number / 1000000) + " Million" + (number % 1000000 != 0 ? " " + convert(number % 1000000) : "");
	        }

	        return convert(number / 1000000000) + " Billion" + (number % 1000000000 != 0 ? " " + convert(number % 1000000000) : "");
	    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number: ");
	        int number = sc.nextInt(); 
	        String words = convertToWords(number);
	        System.out.println("In words: " + words);
	        sc.close();
	    }

}
