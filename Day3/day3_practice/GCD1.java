package day3_practice;
import java.util.Scanner;
public class GCD1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x!=y) {
			if(x>y) {
				x = x -y;
			}else {
				y = y - x;
			}
		}
		
		System.out.println("Grated Commen Divisor:  "+x);

	}

}
