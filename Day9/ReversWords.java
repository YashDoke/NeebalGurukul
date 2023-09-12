package day9;
import java.util.Scanner;
public class ReversWords {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String str = sc.nextLine();
	
	String res[] =  str.split(" ");
	String output="";
	for(int i=res.length-1;i>=0;i--) {
		output += res[i]+" ";
	}
	
	System.out.println("Output: "+output);
	
}
}
