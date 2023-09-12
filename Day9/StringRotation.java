//7) String rotation: Write a program to check if one string is a rotation of another. For eg: abcd
//is a rotation of cdab
// String Rotation: Test Case 1: Input Strings: "abcd", "cdab" Expected Output: True
// Test Case 2: Input Strings: "hello", "world" Expected Output: False
// Test Case 3: Input Strings: "abc", "cab" Expected Output: True
// Test Case 4: Input Strings: "hello", "hello" Expected Output: False (since same strings are
//not considered rotations)
// Test Case 5: Input Strings: "abcdefg", "efgabcd" Expected Output: True
package day9;

import java.util.Scanner;

public class StringRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		System.out.println("Enter a Rotated String:");
		String rotatedStr = sc.nextLine();
		boolean flag = true;
		
		if (str == null || rotatedStr == null || str.equals(rotatedStr) || str.length() != rotatedStr.length()) {
			flag = false;
			System.out.println(flag);
		}
		else {
			String str3 = str + rotatedStr;
			System.out.println(str3.contains(rotatedStr));
		}

		

	}

}
