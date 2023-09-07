package day3_practice;

import java.util.Scanner;

public class GCD3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First Number: ");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int res = 0;
	
	while(x!=0) {
		
		if(x%2!=0) {
			res = res + y;
		}
		x = x/2;
		y = y * 2;
	}
	System.out.println(res);
}
}