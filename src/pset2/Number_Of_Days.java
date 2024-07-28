package pset2;

import java.util.Scanner;

public class Number_Of_Days {

	public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonths[month];
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the year: ");
        int year = sc.nextInt(); 

        int days = getDaysInMonth(month, year);
        if (days == -1) {
            System.out.println("Invalid month: " + month);
        } else {
            System.out.println("Number of days in month " + month + " of year " + year + ": " + days);
        }
        sc.close();
    }

}
