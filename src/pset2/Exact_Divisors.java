package pset2;

import java.util.Scanner;

public class Exact_Divisors {

	public static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
    public static int findNumbersWithExactDivisors(int start, int end, int x) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (countDivisors(i) == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
        
        System.out.print("Enter the number of divisors: ");
        int x = sc.nextInt();
        
        int result = findNumbersWithExactDivisors(start, end, x);
        System.out.println("The number of integers with exactly " + x + " divisors in the range [" + start + ", " + end + "] is: " + result);
        sc.close();
    }

}
