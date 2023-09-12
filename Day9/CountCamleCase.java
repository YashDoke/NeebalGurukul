//9) Count words in a camel case : Create a program that counts the number of words in a
//camelCase String For eg. thisIsCamelCase has 4 words.
//Count Words in CamelCase: Test Case 1: Input: "thisIsCamelCase" Expected Output: 4
//Test Case 2: Input: "helloWorld" Expected Output: 2
//Test Case 3: Input: "iAmHappyToday" Expected Output: 4
//Test Case 4: Input: "camelCase" Expected Output: 2
//Test Case 5: Input: "multipleWordsInCamelCaseAreHere" Expected Output: 7

package day9;

import java.util.Scanner;

public class CountCamleCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String:");
	String str = sc.nextLine();
	
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>64&&str.charAt(i)<91) {
			count++;
		}
	}
	System.out.println("No. of Words in String: "+(count+1));
}
}
