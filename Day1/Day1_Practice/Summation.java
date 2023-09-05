package day1;
import java.util.Scanner;
public class Summation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 digit number: ");
		int num = sc.nextInt();
		
		int firstNum = num/100;
		int middleNum = (num%100)/10;
		int lastNum = num%10;
		
	
		int sumOfNumbers = firstNum + middleNum + lastNum;
		
		int reverse = lastNum *100 + middleNum*10+ firstNum;
		
		int finalSum = num + reverse;
		
		System.out.println("Sum of Digit: "+ sumOfNumbers);
		System.out.println("Reverse Number: "+reverse);
		System.out.println("Addition of reverse + number: "+ finalSum);
	}
}
