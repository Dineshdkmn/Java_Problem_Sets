package pset3;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPalindromeOfArray {

	static boolean isPalindrome(int n) {
        int divisor = 1;
        while (n / divisor >= 10)
            divisor *= 10;
     
        while (n != 0) {
            int leading = n / divisor;
            int trailing = n % 10;
            if (leading != trailing)
                return false;
            n = (n % divisor) / 10;
            divisor = divisor / 100;
        }
        return true;
    }

    public static int longestPalindrome(int []A, int n) {
        Arrays.sort(A);
     
        for (int i = n - 1; i >= 0; --i) {
            if (isPalindrome(A[i]))
                return A[i];
        }
        return -1;
    }

    public static void main(String []args)
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of the array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The longest palindrome in the given array is: ");
        System.out.println(longestPalindrome(arr, arr.length));  
        sc.close();
    }
}
