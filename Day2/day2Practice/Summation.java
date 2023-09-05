package day2Practice;
import java.util.Scanner;
public class Summation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
//	1) Sum of 1st n numbers
//	int sum=0;
//	int num = sc.nextInt();
//	for(int i=1;i<=num;i++) {
//		sum +=i;
//	}
//	System.out.println("Sum of N numbers: "+sum);
	
//	2) Sum of n numbers
	
//	int num = sc.nextInt();
//	int sum=0;
//	
//	for(int i=1;i<=num;i++) {
//		sum += sc.nextInt();
//	}
//	
//	System.out.println(sum);
	
//	int base = sc.nextInt();
//	int power = sc.nextInt();
//	int result =1;
//	for(int i=1;i<=power;i++) {
//		result *=base;
//	}
//	System.out.println(result);
	

boolean flag = true;
while(flag) {
	

	System.out.println("Enter Your choise \n1)Sum of 1st n numbers \n2)Sum of N numbers \n3)Find Power\n4)Exit");
	int choice = sc.nextInt();
	
	switch(choice) {
	case 1:
		int sum=0;
		System.out.println("Enter nth Number: ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			sum +=i;
		}
		System.out.println("Sum of N numbers: "+sum);
		break;
	case 2:
		System.out.println("How many numbers do you want to add: ");
		int numm = sc.nextInt();
		int summ=0;
		
		for(int i=1;i<=numm;i++) {
			System.out.println("Enter "+i+"th Number: ");
			summ += sc.nextInt();
		}
		
		System.out.println("Sum of "+numm+" Numbers: "+summ);
		break;
	case 3:
		System.out.println("Enter Base Value");
		int base = sc.nextInt();
		System.out.println("Enter Power Value");
		int power = sc.nextInt();
		int result =1;
		for(int i=1;i<=power;i++) {
			result *=base;
		}
		System.out.println(base+" ^ "+power+"= "+result);
		break;
	case 4:
		flag = false;
		
	}
}
	
	
}
}
