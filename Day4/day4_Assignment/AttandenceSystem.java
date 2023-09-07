//2. The following array contains attendance data of a student:
//int[] arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
//Write a program to find the attendance percentage of this student.


package day4_Assignment;
import java.util.Scanner;
public class AttandenceSystem {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter length of Array: ");
//	int n = sc.nextInt();
	int[] arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
	int presentDays = 0;
	
//	int arr[] = new int[n];
//	System.out.println("please Enter elements of array: "); // This is for dynamic input
//	for(int i=0;i<arr.length;i++) {
//		arr[i] = sc.nextInt();
//	}
	
	for(int x:arr) {
		if(x==1) {
			presentDays++;
		}
	}
	
	double totalDays = arr.length;
	double percentage = (double)(presentDays /totalDays)*100;
	
	System.out.println("Percentage: "+percentage); // output
	
	
}
}
