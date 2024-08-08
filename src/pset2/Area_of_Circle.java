package pset2;

import java.util.Scanner;

public class Area_of_Circle {

	 public static double calculateArea(double r) {
	        final double PI = 3.142;
	        return PI * r * r; 
	    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the radius: ");
	        double radius = sc.nextDouble(); 
	        double area = calculateArea(radius);
	        System.out.println("The area of a circle with radius " + radius + " is: " + area);
	        sc.close();
	    }

}
