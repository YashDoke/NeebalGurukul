//1. Write a program to input an array from the user and reverse the order of elements in an
//array in place i.e. without using any additional arrays.

package day4_Assignment;


import java.util.Scanner;
public class ReverseArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a length of Array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("please Enter elements of array: ");
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	
	
	for(int i=0,j=arr.length-1;i<j;i++,j--) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	System.out.println("Reversed Array: ");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	
}
}
