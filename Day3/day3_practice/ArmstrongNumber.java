package day3_practice;
import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a Number: ");
//	int num = sc.nextInt();
	int num;
	int temp;
	
	
//	Code to check number is Armstrong or not
	
//	while(num!=0) {
//		int digit = num%10;
//		sum = sum + (digit*digit*digit);
//		num = num/10;
//	}
//	if(temp==sum) {
//		System.out.println("Number is Armstrong");
//	}else {
//		System.out.println("Number is Not Armstrong");
//	}
	
	
//	Print All Armstrong number between 100 to 999;
	System.out.println("Armstrong Number between 100 to 999");
	for(int i=100;i<=999;i++) {
		int sum = 0;
		num=i;
		temp=i;
		while(num!=0) {
			int digit = num%10;
			sum = sum + (digit*digit*digit);
			num = num/10;
			
		}
		if(sum==i) {
			System.out.println(sum);
		}
	}
	
}
}
