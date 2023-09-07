package day4_practice;
import java.util.Scanner;
public class SelectionSort {
	public static void main(String[] args) {
		
		int a[] = {15,8,17,12,4,3};
		
		for(int i=0;i<a.length-1;i++) {
			int index = i;
			
			for(int j =i+1;j<a.length;j++) {
				if(a[j]<a[index]) {
					index = j;
				}
			}
			
			int smaller = a[index];
			a[index] = a[i];
			a[i] = smaller;
			
		}
		
		for(int x: a) {
			System.out.print(x+" ");
		}
	}

}
