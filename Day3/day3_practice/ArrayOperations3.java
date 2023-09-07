package day3_practice;

public class ArrayOperations3 {
public static void main(String[] args) {
	int a[] = {17,18,12,13,15,9,5};
	
	for(int i=0,j=((a.length-1)/2)+1;j<a.length;i++,j++) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	for(int x:a) {
		System.out.print(x+" ");
	}
//	System.out.println((a.length)/2);
}
}
