package day1;

import java.util.Scanner;

public class InputsExamples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String msg = sc.nextLine();
		
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("msg: "+ msg);
	}
}
