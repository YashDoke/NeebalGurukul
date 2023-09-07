package day3_practice;
import java.util.Scanner;
public class Pattern4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number of rows: ");
	int rows = sc.nextInt();
	
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=i;j++) {
			if(i%2!=0) {
				System.out.print((char)(j+64));
			}else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
