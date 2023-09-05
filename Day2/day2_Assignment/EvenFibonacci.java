
//4) Print first 10 even fibonacii numbers

package day2_Assignment;
import java.util.Scanner;
public class EvenFibonacci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = 0,b=1,temp =0,res = 0,count=0;
	
	System.out.println("First 10 Even FIbonacci Numbers: ");
	for(;count<10;) {
		res = a + b;
		temp = a;
		a = b;
		b = res;
		if(res%2==0) {
			System.out.print(res+" ");
			count++;
		}
			
			
		}
		
	}
}

