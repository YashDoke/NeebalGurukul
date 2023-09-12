//2) String Compression: Implement a program that compresses a string by replacing
//consecutive repeated characters with a single occurrence and count.
//String Compression: 
//Test Case 1: Input: "aaabbbccc" Expected Output: "a3b3c3"
//Test Case 2: Input: "aabbbcccdddd" Expected Output: "a2b3c3d4" Test Case 3: Input:
//"abcdefg" Expected Output: "abcdefg"
//Test Case 4: Input: "xxxxxyyyyyyzz" Expected Output: "x5y6z2"
//Test Case 5: Input: "aaAAaabbBBbbcCCcc" Expected Output: "a2A2a2b2B3b1c2C2c2"
//

package day9;
import java.util.Scanner;
public class StringCompression {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a String: ");
	String txt = sc.nextLine();
	
	
	for(int i=0;i<txt.length();i++) {
		int count =1;
		while(i+1<txt.length()&&txt.charAt(i)==txt.charAt(i+1)) {
			i++;
			count++;
		}
		if(count==1) {
			System.out.print(txt.charAt(i));
		}else {
			System.out.print(txt.charAt(i)+""+count);
		}
	}
//	String output="";
//	int count =1;
//	
//	for(int i=1;i<txt.length();i++) {
//		if(txt.charAt(i)==txt.charAt(i-1)) {
//			count +=1;
//		}else {
//			output = output + txt.charAt(i-1);
//			output = output+ count;
//			count = 1;
//		}
//	}
//	output += txt.charAt(0);
//	output = output+ count;
//	count = 1;
//	System.out.println(output);
	
	
	

	
}
}
