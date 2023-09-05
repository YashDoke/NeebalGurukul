package day1_Assignments;

import java.util.Scanner;

public class BusService {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.println("No. of passangers Traveling: "+(50*(x/50)));
	}
}
