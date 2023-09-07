package day3_practice;
import java.util.Scanner;
public class ArrayOperation2 {
public static void main(String[] args) {
	int a[] = {17,18,12,13,15,9};
	int max = 0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>a[max]) {
			max = i;
		}
	}
	a[max] -=10;
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
}
}
