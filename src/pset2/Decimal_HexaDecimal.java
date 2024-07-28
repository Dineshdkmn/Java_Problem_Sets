package pset2;

import java.util.Scanner;

public class Decimal_HexaDecimal {

	public static String decimalToHexadecimal(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        String hexNumber = "";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimalNumber > 0) {
            int rem = decimalNumber % 16;
            hexNumber = hexChars[rem] + hexNumber;
            decimalNumber /= 16;
        }
        return hexNumber;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal value: ");
        int decimalNumber=sc.nextInt();
        String hexNumber = decimalToHexadecimal(decimalNumber);
        System.out.println("The hexadecimal value for the given decimal value " + decimalNumber + " is: " + hexNumber);
        sc.close();
    }

}
