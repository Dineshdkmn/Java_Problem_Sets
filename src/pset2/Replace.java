package pset2;

import java.util.Scanner;

public class Replace {

	public static int replaceZerosWithOnes(int number) {
        String numberStr = Integer.toString(number);
        numberStr = numberStr.replace('0', '1');
        return Integer.parseInt(numberStr);
        
//        int result = 0;
//        int place = 1;
//
//        if (number == 0) {
//            return 1;
//        }
//
//        while (number > 0) {
//            int digit = number % 10;
//            if (digit == 0) {
//                digit = 1;
//            }
//            result += digit * place;
//            place *= 10;
//            number /= 10;
//        }
//
//        return result;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int result = replaceZerosWithOnes(number);
        System.out.println("Modified number: " + result);
        sc.close();
    }

}
