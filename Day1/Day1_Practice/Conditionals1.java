package day1;
import java.util.Scanner;
public class Conditionals1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Salary: ");
			int salary = sc.nextInt();
			
			if(salary<20000) {
				salary += 5000;
			}
			System.out.println("Salary of Employee is : "+ salary);
		
	}
}
