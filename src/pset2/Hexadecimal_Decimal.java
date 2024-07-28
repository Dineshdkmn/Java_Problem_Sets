package pset2;

import java.util.Scanner;

public class Hexadecimal_Decimal {
	public static int hexaToDecimal(String s) {
		int base=1;
		int decimal=0;
		s=s.toUpperCase();
		for(int i=s.length()-1;i>=0;i--) {
			char hexDigit=s.charAt(i);
			int decimalValue=0;
			if(hexDigit>='0' && hexDigit<='9') {
				decimalValue=hexDigit-'0';
			} else {
				decimalValue=hexDigit-'A'+10;
			}
			decimal+=decimalValue*base;
			base*=16;
		}
		return decimal;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hexadecimal value: ");
		String hex=sc.nextLine();
		int result=hexaToDecimal(hex);
		System.out.println("The decimal value for the given hexadecimal value "+hex+" is: "+result);
		sc.close();

	}

}
