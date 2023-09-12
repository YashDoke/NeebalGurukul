//5) Replace characters : Create a program that replaces all occurrences of a specified character
//with another character in a given string.
// Replace Characters: Test Case 1: Input String: "Hello World" Character to Replace: "o"
//Replacement Character: "X" Expected Output: "HellX WXrld"
//Test Case 2: Input String: "abracadabra" Character to Replace: "a" Replacement Character: "z"
//Expected Output: "zbrzczdzbrz"
//Test Case 3: Input String: "Mississippi" Character to Replace: "i" Replacement Character: "e"
//Expected Output: "Messesseppe"
//Test Case 4: Input String: "abcdeedcba" Character to Replace: "d" Replacement Character: "X"
//Expected Output: "abcXeeXcba"
//Test Case 5: Input String: "aaaaa" Character to Replace: "a" Replacement Character: "b"
//Expected Output: "bbbbb"

package day9;

import java.util.Scanner;

public class ReplaceCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans="";
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		System.out.println("Character to Replace: ");
		char r = sc.next().charAt(0);
		
		System.out.println("Replacement Character: ");
		char c = sc.next().charAt(0);
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==r) {
				ans +=c;
			}else {
				ans +=str.charAt(i);
			}
			
		}
		System.out.println(ans);
//		System.out.println(str.replace(r, c));
		
	}

}
