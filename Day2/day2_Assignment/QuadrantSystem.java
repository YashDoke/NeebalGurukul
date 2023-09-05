//Write a program to accept a coordinate point in a XY coordinate system
//and determine in which quadrant the coordinate point lies.

package day2_Assignment;
import java.util.Scanner;
public class QuadrantSystem {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Value of X: ");
	int x = sc.nextInt();
	System.out.println("Enter Value of X: ");
	int y = sc.nextInt();
	
	if(x==0&y==0) {
		System.out.println("At origin");
	}
	else if(x==0 & y>0) {
		System.out.println("Y axis");
	}
	else if(x>0 & y==0) {
		System.out.println("X axis");
	}
	else if(x>0 & y>0) {
		System.out.println("1st Quadrant");
	}
	else if(x<0 & y>0) {
		System.out.println("2nd Quadrant");
	}
	else if(x<0 & y<0) {
		System.out.println("3rd Quadrant");
	}
	else if(x>0 & y<0) {
		System.out.println("4th Quadrant");
	}
	
}
}
