//3) Check balanced parenthesis : Develop a program that checks whether at given string
//containing parenthesis is balanced or not.
//Check Balanced Parentheses: Test Case 1: Input: "((()))" Expected Output: True
//Test Case 2: Input: "()()()()" Expected Output: True
//Test Case 3: Input: "((())" Expected Output: False
//Test Case 4: Input: "(()())" Expected Output: True
//Test Case 5: Input: "())(" Expected Output: False


package day9;

import java.util.Scanner;

public class BalancedParentheses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		int count = 0;
		boolean ans = true;
		for (char ch : str.toCharArray()) {
			if(str.length()%2!=0) {
				ans = false;
			}
			else if (ch == '(') {
				count++; // Increment count for an open parenthesis
			} else if (ch == ')') {
				count--; // Decrement count for a closing parenthesis
			}
			if (count < 0) {
				ans = false;
			}
		}
		System.out.println(ans);
		
	}
}
