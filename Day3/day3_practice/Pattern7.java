package day3_practice;

public class Pattern7 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print((char)(j+64));
		}
		for(int k=(5-i)*2;k>=1;k--) {
			System.out.print(" ");
		}
		for(int j=i;j>=1;j--) {
			System.out.print((char)(j+64));
		}
		
		System.out.println();
	}
}
}
