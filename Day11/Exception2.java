
//2) Write a program to find the number of vowels in the given String using exception
//handling.

package day11_Assignment;
import java.util.Scanner;

public class Exception2 {
	public static int countVowels(String inputString) {
	    if (inputString == null) {
	        throw new IllegalArgumentException("Input string cannot be null.");
	    }

	    int count = 0;
	    for (char ch : inputString.toLowerCase().toCharArray()) {
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            count++;
	        }
	    }
	    return count;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    try {
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels in the string: " + vowelCount);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }

	
	
	
//	Temporary trial solution
//	String s = sc.nextLine();
//	int vowelsCount = 0;
//	
//	 
//	for(int i=0;i<s.length();i++) {
//		try {
//			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
//				vowelsCount++;
//			}
//		} catch (Exception e) {
//			System.out.println("Exception:"+e);
//			
//		}
//	}
//	
//	System.out.println("Vowels Count: "+vowelsCount);

}
}
