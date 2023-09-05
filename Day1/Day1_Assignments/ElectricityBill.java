package day1_Assignments;
import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Your Units: ");
		int totalUnits = sc.nextInt();
		int temp = totalUnits;
		double result;
		if(totalUnits<=100) {
			result = totalUnits * 4;
		}else if(totalUnits<=300) {
			result = 400;
			totalUnits = totalUnits - 100;
			result = result + (totalUnits*5);
		}else {
			result = 1400;
			totalUnits = totalUnits - 300;
			result = result + (totalUnits*10);
		}
		
		if(result>=1000) {
			result = result + (result*0.05);	
		}
		result = result + (result*0.18);
		
		System.out.println("Name: "+name);
		System.out.println("Units: "+temp);
		System.out.println("Amount: "+result);
		
		
		
		
		
	}
}
