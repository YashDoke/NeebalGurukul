//3. Input the lower bound and upper bound then print all the Fibonacci numbers within the
//bound
//Test case : Input lower =5 and upper= 40
//Output: 5 8 13 21 34
//

package day2_Assignment;
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Lower Bound: ");
	int lowerBound = sc.nextInt();
	System.out.println("Enter Upper Bound: ");
	int upperBound = sc.nextInt();
	
	int a =0,b=1,temp=0,res=0;
	System.out.println("fibonacci Series: ");
	
	if(lowerBound==0) {
		System.out.print(a+" ");
	}
	 if(lowerBound<=1) {
		System.out.print(b+" ");
	}
	
	for(int i=0;i<=upperBound+1;i++) {
		res = a + b;
		if(res>upperBound) {
			break;
		}else {
			if(res>=lowerBound) {
				
				System.out.print(res+" ");
			}
			temp = a;
			a = b;
			b = res;
			
		}
		
	}

		
}
}
