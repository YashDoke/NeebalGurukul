package day1_Assignments;
import java.util.Scanner;
public class MilitoryTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time: ");
		int time = sc.nextInt();
		
		int hours = time/100;
		int minutes = time%100;
		
		 
		if(hours>11) {
			if(hours==12) {
				System.out.println(hours+":"+minutes+"PM");
			}else {
				
				System.out.println(hours-12+":"+minutes+"PM");
			}
		}else {
			if(hours==0) {
				System.out.println(hours+12+":"+minutes+"AM");
			}else {
				
				System.out.println(hours+":"+minutes+"AM");
				
			}
		}
		
		
	}
}
