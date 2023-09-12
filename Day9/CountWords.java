//4) Count words: Write a program that counts the number of words in a given sentence,
// Count Words: Test Case 1: Input: "Hello World" Expected Output: 2
// Test Case 2: Input: "This is a test sentence." Expected Output: 5
// Test Case 3: Input: " Spaces should not affect word counting " Expected Output: 5
// Test Case 4: Input: "OneWord" Expected Output: 1
// Test Case 5: Input: "1 2 3 4 5" Expected Output: 5

// Test Case 3: Input: " Spaces should not affect word counting " Expected Output: 5 this is 6 not 5
package day9;

import java.util.Scanner;

public class CountWords {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String:");
	String str = sc.nextLine();
	str=str.trim();
	String sr[] = str.split(" ");
	System.out.println("Word Count:"+sr.length);
}
}
