//15) Title case : Write a program that converts a given sentence into to title case. Where the
//first letter of each word is capitalized.
//Title Case: Test Case 1: Input: "hello world" Expected Output: "Hello World"
//Test Case 2: Input: "this is a test sentence." Expected Output: "This Is A Test Sentence."
//Test Case 3: Input: "camelCase" Expected Output: "CamelCase"
//Test Case 4: Input: " this is a title " Expected Output: " This Is A Title "
//Test Case 5: Input: "i am happy today" Expected Output: "I Am Happy Today"


package day9;

import java.util.Scanner;

public class TitleCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String str = sc.nextLine();
	String a[] = str.split(" ");

	str = "";
	
	for(int i=0;i<a.length;i++) {
		a[i] = a[i].substring(0,1).toUpperCase()+a[i].substring(1);
		str+= a[i]+" ";
	}
	str = str.trim();
	System.out.println(str);
}
}

