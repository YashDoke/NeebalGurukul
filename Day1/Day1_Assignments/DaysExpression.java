package day1_Assignments;
import java.util.Scanner;
public class DaysExpression {
	public static void main(String[] args) {
		int temp =0;
		int totalDays = 1020;
		
		int years = totalDays/365;
		
		temp= totalDays - (years*365);
		
		int months = temp/30;
		
		temp = temp - months*30;
		
		int weeks = temp/7;
		
		int days = temp - weeks*7;
		
		System.out.println(years+" years :"+months+" Months: "+weeks+" Weeks: "+days+" Days");
	}
}
