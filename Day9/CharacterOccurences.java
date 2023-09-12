//10) Count character occurrences : Write a program that counts the occurrences of each
//character in a String.
// Count Character Occurrences: Test Case 1: Input: "hello world" Expected Output: {'h': 1, 'e':
//1, 'l': 3, 'o': 2, ' ': 1, 'w': 1, 'r': 1, 'd': 1}
// Test Case 2: Input: "abracadabra" Expected Output: {'a': 5, 'b': 2, 'r': 2, 'c': 1, 'd': 1}
//Test Case 3: Input: "Mississippi" Expected Output: {'M': 1, 'i': 4, 's': 4, 'p': 2}
//Test Case 4: Input: "aaaAAAbbCCC" Expected Output: {'a': 4, 'A': 3, 'b': 2, 'C': 3}
//Test Case 5: Input: "123!@# hello" Expected Output: {'1': 1, '2': 1, '3': 1, '!': 1, '@': 1, '#':
//1, ' ': 1, 'h': 1, 'e': 1, 'l': 2, 'o': 1}

package day9;
import java.util.Scanner;
public class CharacterOccurences {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String:");
	String str = sc.nextLine();
	
	 int[] charCount = new int[256]; // Assuming ASCII characters

     for (char ch : str.toCharArray()) {
         if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
             charCount[ch]++;
         }

     }
     System.out.print("{");
     for (int i = 0; i < 256; i++) {
         if (charCount[i] > 0) {
             System.out.print((char) i + ":" + charCount[i]+" ");
         }
     }
     System.out.print("}");
	
	
	
	
}
}
