package pset2;

import java.util.Scanner;

public class Handshakes {

	 public static int maximumHandshakes(int n) {
	        return (n * (n - 1)) / 2;
	    }

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number of people: ");
	        int n = sc.nextInt(); 
	        int result = maximumHandshakes(n);
	        System.out.println("The maximum number of handshakes among " + n + " people is: " + result);
	        sc.close();
	    }

}
