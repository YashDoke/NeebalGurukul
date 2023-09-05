package day2Practice;
import java.util.Scanner;
public class SeriesProblems {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = 3;
//		double sum = 0;
		
//		for(int i = 1;i<=n;i++) {
//			sum = sum + ((double)1/i);
//		}
//		System.out.println(sum);
		
//		for(int i = 1;i<=n;i++) {
//		sum = sum + ((double)1/(i*i));
//		}
//		System.out.println(sum);
		
//		int temp = 1;
//		for(int i = 1;i<=n;i++) {
//			temp = i * temp;
//			sum = sum + ((double)1/(temp));
//		}
//		System.out.println(sum);
		
		int n = 4;
		int fact = 1;
		double num =1;
		double sum = 0;
		for(int i = 1;i<=n*2-1;i++) {
			fact = i * fact;
			if(i%2!=0) {
				sum = sum + ((double)num/(fact));
				num = -num ;
			}
			
		}
		System.out.println(sum);
//		
//		double x = sc.nextDouble();
//		x = Math.toRadians(x);
//		double sum =0;
//		double fact = 1;
//		double num = x;
//		for(int i=1;i<=19;i++) {
//			fact = fact * i;
//			if(i%2!=0) {
//				sum = sum + num/fact;
//				num = -num*x*x;
//			}
//		}
//		System.out.println(sum);
//		
		
		
		
		
		


	}
}
