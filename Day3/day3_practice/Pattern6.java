package day3_practice;
import java.util.Scanner;
public class Pattern6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of Rows: ");
	int rows = sc.nextInt();

//	1 
//	12 
//	123 
//	1234 
//	12345 
	
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(j);
//		}
//		System.out.println(" ");
//	}
	
	for(int i=1;i<=rows;i++) {
		
		for(int j = 1;j<=rows-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(k);
		}
		for(int k=i-1;k>=1;k--) {
			System.out.print(k);
		}
		
		System.out.println();
	}
for(int i=rows;i>=1;i--) {
		
		for(int j = 1;j<=rows-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(k);
		}
		for(int k=i-1;k>=1;k--) {
			System.out.print(k);
		}
		
		System.out.println();
	}
	
}
}
