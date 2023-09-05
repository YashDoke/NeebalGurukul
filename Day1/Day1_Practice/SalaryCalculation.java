package day1;

import java.util.Scanner;

public class SalaryCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		double tax=0,payout=0;
		System.out.println("Enter Your Total CTC");
		double salary = sc.nextDouble();
		
		if(salary>=1500000) {
			 tax = 0.25 * salary;
			
		}else if(salary>=1000000 ) {
			 tax = 0.20 * salary;
			
		}else if(salary>=750000 ) {
			 tax = 0.10 * salary;
			 
		}else {
			tax = 0;
		}
		
		payout = salary-tax;
		
		
		System.out.println("Total Salary: "+salary);
		System.out.println("Tax Amount: "+ tax);
		System.out.println("Payout: "+payout);
			
			
		
	}
}
