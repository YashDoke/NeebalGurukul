package day1;

import java.util.Scanner;

public class GreatestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int x = sc.nextInt();
		System.out.println("Enter Second Number");
		int y = sc.nextInt();
		
		System.out.println("Enter Third Number");
		int z = sc.nextInt();
		
		int d = x>y?x:y;
		int e = d>z?d:z;
		
		System.out.println("Greater Number: "+e);
		
		
		
		
	}
}
