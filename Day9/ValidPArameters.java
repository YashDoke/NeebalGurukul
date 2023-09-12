//14) Valid Palindromes : Write a program that checks whether a given string is a valid
//palindrome. Consider only alphanumeric characters and ignoring cases.
//Valid Palindrome: Test Case 1: Input: "A man, a plan, a canal: Panama" Expected Output:
//True
//Test Case 2: Input: "race a car" Expected Output: False
//Test Case 3: Input: "Never odd or even" Expected Output: True
//Test Case 4: Input: "12321" Expected Output: True
//Test Case 5: Input: "hello" Expected Output: False

package day9;

import java.util.Scanner;

public class ValidPArameters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String str = sc.nextLine();
	String newStr[] = str.split("[' '|':'|',']");
	String s = "";
	for(int i =newStr.length-1;i>=0;i--) {
		s =newStr[i]+s;
	}
	String revString="";
	for(int i =s.length()-1;i>=0;i--) {
		revString +=s.charAt(i);
	}
//	System.out.print(revString);
	
	if(s.equalsIgnoreCase(revString)) {
		System.out.println("True");
	}else {
		System.out.println("False");
	}
	
	
}
}
