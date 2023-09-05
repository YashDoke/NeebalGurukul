package day1_Assignments;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1,d2,d3,temp;
		System.out.println("Enter A Number: ");
		int number = sc.nextInt();
		
		d1 = number/100;
		
		d2 = (number%100)/10;
		
		d3 = number%10;
		
		temp = (d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
		
		if(number==temp) {
			System.out.println(number+" is an Armstrong Number");
		}else {
			System.out.println(number+" is Not an Armstrong Number");
		}
		
		
	}
}
