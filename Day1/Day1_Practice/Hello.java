package day1;

import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of first Side");
		double a = sc.nextDouble();
		System.out.print("Enter value of Second Side");
		double b = sc.nextDouble();
		
		double c = Math.pow(a, 2) + Math.pow(b, 2);
		
		
		System.out.println("Third side of triangle usinf math  "+Math.sqrt(c) );
		
		
		
		
		
		

	}

}
