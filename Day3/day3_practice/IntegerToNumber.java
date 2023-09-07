package day3_practice;
import java.util.Scanner;
public class IntegerToNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = sc.nextInt();
	String number= "";
	while(num!=0) {
		int digit = num%10;
		num = num/10;
		
		switch(digit) {
		case 0:
			number = " Zero"+number ;
			break;
		case 1:
			number =  " One"+number;
			break;
		case 2:
			number = " Two"+number;
			break;
		case 3:
			number = " Three"+number;
			break;
		case 4:
			number = " Four"+number;
			break;
		case 5:
			number = " Five"+number;
			break;
		case 6:
			number =  " Six"+number;
			break;
		case 7:
			number =  " Seven"+number;
			break;
		case 8:
			number =" Eight"+number;
			break;
		
		case 9:
			number = " Nine"+number;
			break;
		}
	}
	System.out.println("Number in Word: "+number);
}
}
