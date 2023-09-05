package day1_Assignments;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		
		System.out.println("Enter First Number: ");
		x = sc.nextInt();
		System.out.println("Enter Second Number: ");
		y = sc.nextInt();
		System.out.println("Enter Third Number: ");
		z = sc.nextInt();
		
		int a = x>y?x:y;
		int b = a>z?a:z;
		
		System.out.println("Largest Number Amongst 3 is : "+b);
	}
}
