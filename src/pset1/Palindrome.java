package pset1;

import java.util.Scanner;

public class Palindrome {
		static String reverse="";
		public static void isPalindrome(String original) {
			int length=original.length();
			for(int i=length-1;i>=0;i--) {
				reverse+=original.charAt(i);
			}
			if(original.equals(reverse)) {
				System.out.println("The given value "+original+" is a palindrome.");
			} else {
				System.out.println("The given value "+original+" is not a palindrome.");
			}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string/number:");
			String str=sc.nextLine();
			Palindrome.isPalindrome(str);
			sc.close();
		}

	}

