package day3_practice;

public class ArrayRotation {
public static void main(String[] args) {
	
	int a[] = {17,18,12,13,15,9};
	
	int t = a[a.length-1];
	
	for(int i=a.length-1;i>0;i--) {
		a[i] = a[i-1];
	}
	a[0]=t;
	
//	for(int i=0;i<a.length;i++) {
//		System.out.print(a[i]+" ");
//	}
	
	for(int x:a) {
		System.out.print(x+" ");
	}
}
}
