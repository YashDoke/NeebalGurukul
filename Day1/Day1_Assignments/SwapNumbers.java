package day1_Assignments;
import java.util.Scanner;
public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		int num = 4523;
		
		int temp = num%100;
		
		int result = temp *100 + num/100;
		
		
		System.out.println("Result: "+result);
		
		
	}
}
