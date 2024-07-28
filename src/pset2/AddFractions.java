package pset2;

import java.util.Scanner;

public class AddFractions {

	public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int[] simplifyFraction(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        return new int[]{numerator / gcd, denominator / gcd};
    }
    public static int[] addFractions(int num1, int denom1, int num2, int denom2) {
        int commonDenominator = denom1 * denom2;
        int adjustedNum1 = num1 * denom2;
        int adjustedNum2 = num2 * denom1;
        int sumNumerator = adjustedNum1 + adjustedNum2;
        return simplifyFraction(sumNumerator, commonDenominator);
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the first numerator: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the first denominator: ");
        int denom1 = sc.nextInt();
        System.out.println("Enter the second numerator: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the second denominator: ");
        int denom2 = sc.nextInt(); 

        int[] result = addFractions(num1, denom1, num2, denom2);
        System.out.println("The sum of " + num1 + "/" + denom1 + " and " + num2 + "/" + denom2 + " is: " 
                           + result[0] + "/" + result[1]);
        sc.close();
    }

}
