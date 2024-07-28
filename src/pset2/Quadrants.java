package pset2;

import java.util.Scanner;

public class Quadrants {

	 public static String findQuadrant(int x, int y) {
	        if (x > 0 && y > 0) {
	            return "Quadrant I";
	        } else if (x < 0 && y > 0) {
	            return "Quadrant II";
	        } else if (x < 0 && y < 0) {
	            return "Quadrant III";
	        } else if (x > 0 && y < 0) {
	            return "Quadrant IV";
	        } else if (x == 0 && y != 0) {
	            return "On the y-axis";
	        } else if (x != 0 && y == 0) {
	            return "On the x-axis";
	        } else {
	            return " the origin";
	        }
	    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the value of point x: ");
	        int x = sc.nextInt();
	        System.out.println("Enter the value of the point y ");
	        int y = sc.nextInt();
	        String quadrant = findQuadrant(x, y);
	        System.out.println("The point (" + x + ", " + y + ") lies at: " + quadrant);
	        sc.close();
	    }

}
