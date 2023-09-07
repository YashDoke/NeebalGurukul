package day3_practice;

public class Pattern3 {
public static void main(String[] args) {
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print((char)(j+64));
//		}
//		System.out.println();
//	}
	
	for(int i=1;i<=5;i++) {
		for(int j=i*2-1;j>=i;j--) {
			System.out.print((char)(j+64));
		}
		System.out.println();
	}
}
}
