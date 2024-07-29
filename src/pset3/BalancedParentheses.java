package pset3;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
	
	 public static boolean isBalanced(String s) {
	        Stack<Character> stack = new Stack<>();
	        for (char ch : s.toCharArray()) {
	            switch (ch) {
	                case '(':
	                case '{':
	                case '[':
	                    stack.push(ch);
	                    break;
	                case ')':
	                    if (stack.isEmpty() || stack.pop() != '(') {
	                        return false;
	                    }
	                    break;
	                case '}':
	                    if (stack.isEmpty() || stack.pop() != '{') {
	                        return false;
	                    }
	                    break;
	                case ']':
	                    if (stack.isEmpty() || stack.pop() != '[') {
	                        return false;
	                    }
	                    break;
	                default:
	                    break;
	            }
	        }
	        return stack.isEmpty();
	    }
	 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check for balanced parentheses: ");
        String input = sc.nextLine(); 

        if (isBalanced(input)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
        sc.close();
    }

}

//without using Stack

//public static boolean isBalanced(String s) {
//    int balanceParentheses = 0; // For ()
//    int balanceBraces = 0;      // For {}
//    int balanceBrackets = 0;    // For []
//
//    // Traverse the input string
//    for (char ch : s.toCharArray()) {
//        switch (ch) {
//            case '(':
//                balanceParentheses++;
//                break;
//            case ')':
//                balanceParentheses--;
//                if (balanceParentheses < 0) return false;
//                break;
//            case '{':
//                balanceBraces++;
//                break;
//            case '}':
//                balanceBraces--;
//                if (balanceBraces < 0) return false;
//                break;
//            case '[':
//                balanceBrackets++;
//                break;
//            case ']':
//                balanceBrackets--;
//                if (balanceBrackets < 0) return false;
//                break;
//            default:
//                // Ignore non-parenthesis characters
//                break;
//        }
//    }
//
//    // All counters should be zero if balanced
//    return balanceParentheses == 0 && balanceBraces == 0 && balanceBrackets == 0;
//}

