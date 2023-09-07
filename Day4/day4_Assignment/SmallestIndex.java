//5. Write a program to input an array from the user and find the index of the smallest element
//in the array.

package day4_Assignment;

import java.util.Scanner;

public class SmallestIndex {
public static void main(String[] args) {
//	int a[] = {15,8,17,12,4,3};
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter length of Array: ");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("please Enter elements of array: "); // This is for dynamic input
	for(int i=0;i<a.length;i++) {
		a[i] = sc.nextInt();
	}
	int index=0;
	
		
		for(int j =1;j<a.length;j++) {
			if(a[j]<a[index]) {
				index = j;
			}
		}	
	
	System.out.println("Smalles Index: "+index);
	
}
}
