package pset2;

import java.util.Scanner;

public class Decimal_Octal {

	public static String decimalToOctal(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        String octalNumber = "";
        while (decimalNumber > 0) {
            int rem = decimalNumber % 8;
            octalNumber = rem+octalNumber;
            decimalNumber /= 8;
        }
        return octalNumber;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal value: ");
        int decimalNumber=sc.nextInt();
        String octalNumber = decimalToOctal(decimalNumber);
        System.out.println("The octal value for the given decimal value " + decimalNumber + " is: " + octalNumber);
        sc.close();
    }

}
