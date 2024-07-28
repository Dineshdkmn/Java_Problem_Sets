package pset1;

import java.util.Scanner;

public class LeapYear {
	public static void isLeap(int y) {
		boolean is_leap_year=false;
		if(y%4==0) {
			is_leap_year=true;
			if(y%100==0) {
				if(y%400==0) {
					is_leap_year=true;
				} else {
					is_leap_year=false;
				}
			}
		} else {
			is_leap_year=false;
		}
		if(is_leap_year) {
			System.out.println("The year "+y+" is a leap year.");
		} else {
			System.out.println("The year "+y+" is not a leap year.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		LeapYear.isLeap(year);
		sc.close();
	}

}
