package day3_practice;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int x = sc.nextInt();
		int sum = 0;
		
		while(x!=0) {
			
			sum = sum + (x%10);
			x = x/10;
			
		}
		System.out.println("Sum of Digits: "+sum);
	}

}
