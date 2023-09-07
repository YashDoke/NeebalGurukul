package day3_practice;
import java.util.Scanner;
public class Pattern8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number of Rows: ");
	int rows = sc.nextInt();
	for(int i=1;i<=rows-1;i++) {
		for(int j=1;j<=(rows)-i;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}
	for(int i=1;i<=(rows*2-1);i++) {
		System.out.print(" *");
	}
	System.out.println();
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=rows-1;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=(rows)-i;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
}
