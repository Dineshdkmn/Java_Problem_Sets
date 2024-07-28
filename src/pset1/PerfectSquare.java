package pset1;

import java.util.Scanner;

public class PerfectSquare {
	public static boolean isPerfectSquare(int n) {
		if (n < 0) {
            return false;
        }
//        int sqrt = (int) Math.sqrt(n);
//        return sqrt * sqrt == n;
		for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }    
        return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if (isPerfectSquare(num)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
		sc.close();
	}
}
