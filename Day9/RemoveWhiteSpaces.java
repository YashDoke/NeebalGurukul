//1) Remove whitespace : Write a program that takes a sentence as input and removes all the
//whitespace characters from it.
//. Remove Whitespace: Test Case 1: Input: "Hello World" Expected Output: "HelloWorld"
// Test Case 2: Input: " This is a test " Expected Output: "Thisisatest"
// Test Case 3: Input: "NoWhitespaceHere" Expected Output: "NoWhitespaceHere"
// Test Case 4: Input: " 123 456 789 " Expected Output: "123456789"
// Test Case 5: Input: " " Expected Output: "" (empty string after removing all whitespace)

package day9;

import java.util.Scanner;

public class RemoveWhiteSpaces {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String txt = sc.nextLine();
	String arr[] = txt.split(" "); //converting string to array 
	String output="";
	for(String x:arr) {
		output += x;   // concatinating array elements to String
	}
	
	System.out.println("Output:"+output);
}
}
