package day1;
import java.util.Scanner;
public class NotesCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int amount = sc.nextInt();
		int temp = amount;
		int curr;
		int n500 = amount/500;
		curr = amount - (n500*500);
		int n200 = curr/200;
		curr = curr - (n200*200);
		int n100 = curr/100;
		curr = curr - (n100*100);
		int n50 = curr/50;
	curr = curr - (n50*50)   ;
		int n20 = curr/20;
		curr = curr - (n20*20);
		int n10 = curr/10;
		curr = curr - (n10*10);
		
		System.out.println("500 * "+n500 + " = "+(n500*500));
		System.out.println("200 * "+n200 + " = "+(n200*200));
		System.out.println("100 * "+n100 + " = "+(n100*100));
		System.out.println("50 * "+n50 + " = "+(n50*50));
		System.out.println("20 * "+n20 + " = "+(n20*20));
		System.out.println("10 * "+n10 + " = "+(n10*10));





		
//		System.out.println("Notes of 200: "+n200);
//		System.out.println("Notes of 100: "+n100);
//		System.out.println("Notes of 50: "+n50);
//		System.out.println("Notes of 20: "+n20);
//		System.out.println("Notes of 10: "+n10);
		
	}
}
