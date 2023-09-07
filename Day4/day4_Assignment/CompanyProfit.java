//6. The following arrays shows the profits of a company from 2001 to 2010:
//int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
//Write a program to find which year the decline in profits began.

package day4_Assignment;

public class CompanyProfit {
public static void main(String[] args) {
	int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
	
	int result = 0;
	for(int i=0;i<profits.length-1;i++) {
		if(profits[i]>profits[i+1]) {
			result = i+1+2001;
			break;
		}
	}
	System.out.println("year the decline in profits began: "+result);
}
}
