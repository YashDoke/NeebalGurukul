package day2Practice;
import java.util.Scanner;
public class VariablePractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
		short num = sc.nextShort();
//		
//		Using bitwise or (|)
//		int temp = num|1;
//		if(num==temp) {
//			System.out.println("Number is Odd");
//		}else {
//			System.out.println("Number is Even");
//		}
		
//		Using Bitwise And (&)
		
		if((num&1)==1) {
			System.out.println("Number is Odd");
		}
		else {
			System.out.println("Number is Even");
		}
		
//		System.out.println(num&3);
		
	}
}
