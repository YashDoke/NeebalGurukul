package day3_practice;
import java.util.Scanner;

public class GCD2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int reminder =1;
		
		while(reminder!=0) {
			if(x>y) {
				reminder = x % y;
				x = y;
				y = reminder;
			}else {
				reminder = y % x;
				y = x;
				x = reminder;
			}
		}
		int ans = x>y?x:y;
		System.out.println("Greatest Commen Devisor: "+ans);
		
	}
}
