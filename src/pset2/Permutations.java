package pset2;

import java.util.Scanner;

public class Permutations {

	public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public static long permutations(int n, int r) {
        if (r > n) {
            return 0;
        }
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of people: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of seats: ");
        int r = sc.nextInt(); 
        long result = permutations(n, r);
        System.out.println("The number of permutations in which " + n + " people can occupy " + r + " seats is: " + result);
        sc.close();
    }

}
