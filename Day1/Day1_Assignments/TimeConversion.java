package day1_Assignments;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int miliSeconds = sc.nextInt();
//		int miliSeconds = 7000234;
		
		int seconds = (miliSeconds/1000)%60;
		
		int minutes = (miliSeconds/60000)%60;
		
		int hour = miliSeconds/3600000;
		
//		
		
		
		System.out.println(hour+":"+minutes+":"+seconds);
		
		
	}
}
