package pset2;

import java.util.Scanner;

public class Octal_Binary {

	 public static String octalToBinary(String octalNumber) {
	        int decimalValue = 0;
	        int base = 1;

	        for (int i = octalNumber.length() - 1; i >= 0; i--) {
	            decimalValue += (octalNumber.charAt(i) - '0') * base;
	            base *= 8;
	        }
	        String binaryNumber = "";
	        if(decimalValue<=0) {
	        	return "0";
	        }
	        while (decimalValue > 0) {
	            int rem = decimalValue % 2;
	            binaryNumber = rem + binaryNumber;
	            decimalValue /= 2;
	        }

	        return binaryNumber;
	    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the octal number: ");
	        String octalNumber = sc.next(); 
	        String binaryNumber = octalToBinary(octalNumber);
	        System.out.println("The binary value for the given octal value " + octalNumber + " is: " + binaryNumber);
	        sc.close();
	    }

}
