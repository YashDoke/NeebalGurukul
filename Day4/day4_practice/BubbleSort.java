package day4_practice;

public class BubbleSort {
public static void main(String[] args) {
	int a[] = {15,8,17,12,4,3};
	
	for(int i=1;i<a.length;i++) {
		for(int j=0;j<a.length-i;j++) {
			if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	
	for(int x:a) {
		System.out.println(x);
	}
}
}
