package day3_practice;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	boolean isPrime = true;
	
	for(int i=2;i<=Math.sqrt(num);i++)
	{
		if(num%i==0) {
			isPrime = false;
			break;
		}
	}
	if(isPrime) {
		System.out.print(num+"is a prime Number");
	}else {
		System.out.print(num+"is Not a prime Number");
	}
}
}
