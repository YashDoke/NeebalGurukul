package day1;

import java.util.Scanner;

public class Conditionals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int x = sc.nextInt();
		System.out.println("Enter Second Number");
		int y = sc.nextInt();
		
		int z = x>y ? x/y : y/x;
		
		System.out.println(z);
	}
}
