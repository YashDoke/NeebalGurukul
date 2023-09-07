//3)Write a program to store the quarterly sales report in another array and display the
//monthly, quarterly and total sales. (Note: January, February, March and April form the first
//quarter)

package day4_Assignment;

import java.util.Scanner;

public class SalesReport {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int sale[] = new int[12];
		int quarterly[] = new int[3];
		int totalSales = 0;
		System.out.println("Enter monthly sales");
		for(int i=0;i<12;i++) {
			sale[i] = sc.nextInt();
			totalSales += sale[i];
		}
		
		
		for(int i=0;i<12;i++) {

			if(i<4) {
				quarterly[0] +=  sale[i];
			}
			if(i>=4 && i<=7) {
				quarterly[1] +=  sale[i];
			}
			if(i>=8 && i<=11) {
				quarterly[2] +=  sale[i];
			}
		}
		System.out.println("Monthly Sales: ");
		for(int i=0;i<12;i++) {
			System.out.println(months[i]+" : "+sale[i]);
		}
		System.out.println();
		System.out.println("Quarterly Sales:");
		for(int i=0;i<3;i++) {
			System.out.println("quarter "+(i+1)+" "+quarterly[i]);
		}
		System.out.println();
		System.out.println("Total Sales: "+totalSales);
		
		
		

	}

}
