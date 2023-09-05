
//Q--Write a program to calculate Cosine series

package day2_Assignment;
import java.util.Scanner;
public class CosineSeries {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter angle: ");
	double x = sc.nextDouble();
	
	x = Math.toRadians(x);
	
	double sum = 1,fact=1,num=1;
	
	for(int i=2;i<=18;i++) {
		fact = fact * i;
		
		if(i%2==0) {
			num = -num * x * x;
			sum = sum + num/fact;
			
		}
		
	}
	System.out.println("Result: "+sum);
	
}
}
