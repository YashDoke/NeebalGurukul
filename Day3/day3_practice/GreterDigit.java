package day3_practice;
import java.util.Scanner;
public class GreterDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int num = sc.nextInt();
	
	int larger = 0;
	
	while(num!=0) {
		if(num%10>larger) {
			larger = num%10;
		}
		num /= 10; 
	}
	System.out.println("Larger Digit: "+larger);
}
}
