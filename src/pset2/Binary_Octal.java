package pset2;

import java.util.Scanner;

public class Binary_Octal {

	 public static String binaryToOctal(String binaryNumber) {
	        int decimalValue = 0;
	        int base = 1;  

	        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
	            if (binaryNumber.charAt(i) == '1') {
	                decimalValue += base;
	            }
	            base *= 2; 
	        }
	        String octalNumber = "";
	        if(decimalValue<=0) {
	        	return "0";
	        }
	        while (decimalValue > 0) {
	            int rem = decimalValue % 8;
	            octalNumber = rem + octalNumber;
	            decimalValue = decimalValue / 8;
	        }

	        return octalNumber;
	    }

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the binary value: ");
	        String binaryNumber=sc.next();
	        String octalNumber = binaryToOctal(binaryNumber);
	        System.out.println("The octal value for the given binary value " + binaryNumber + " is: " + octalNumber);
	        sc.close();
	    }

}
