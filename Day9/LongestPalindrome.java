//6) Longest Palindromic Substring : Given a String , find the longest palindromic substring
//within it.
//Longest Palindromic Substring: Test Case 1: Input String: "babad" Expected Output: "bab"
//Test Case 2: Input String: "cbbd" Expected Output: "bb"
//Test Case 3: Input String: "racecar" Expected Output: "racecar"
//Test Case 4: Input String: "abcdefg" Expected Output: "a" or "b" or "c" ... (as there is no
//palindromic substring)
//Test Case 5: Input String: "noon" Expected Output: "noon"

package day9;

import java.util.Scanner;

public class LongestPalindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String str = sc.nextLine();
	if (str == null || str.length() < 2) {
        System.out.println(str);
    }

    int n = str.length();
    boolean[][] isPalindrome = new boolean[n][n];
    int start = 0;
    int maxLength = 1; 
    for (int i = 0; i < n; i++) {
        isPalindrome[i][i] = true;
    }
    for (int i = 0; i < n - 1; i++) {
        if (str.charAt(i) == str.charAt(i + 1)) {
            isPalindrome[i][i + 1] = true;
            start = i;
            maxLength = 2;
        }
    }

    for (int len = 3; len <= n; len++) {
        for (int i = 0; i < n - len + 1; i++) {
            int j = i + len - 1;

            if (str.charAt(i) == str.charAt(j) && isPalindrome[i + 1][j - 1]) {
                isPalindrome[i][j] = true;

                if (len > maxLength) {
                    start = i;
                    maxLength = len;
                }
            }
        }
    }

    System.out.println(str.substring(start, start + maxLength));
}
}
