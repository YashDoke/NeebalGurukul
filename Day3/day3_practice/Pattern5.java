package day3_practice;
import java.util.Scanner;
public class Pattern5 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			if(j==i) {
				System.out.print(" *");	
			}
			else {
				System.out.print("  ");
			}
			
		}
		if(i==1||i==5)
		{
			for(int k=1;k<=8;k++) {
				System.out.print(" *");
			}
		}
		else {
			for(int k=1;k<=8;k++) {
				System.out.print("  ");
			
		    }
		}
		System.out.print(" *");
		System.out.println();
	}
}
}
