package pset1;
import java.util.Scanner;
public class GreatestOfTwo {
	public static void isGreater(int a, int b) {
		if(a>b) {
			System.out.println("a is greater than b.");
		} else {
			System.out.println("b is greater than a.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		GreatestOfTwo.isGreater(a, b);
		sc.close();
	}

}
