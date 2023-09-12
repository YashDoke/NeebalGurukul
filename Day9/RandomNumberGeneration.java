//20) Write a program to generate a random numbers with a specific range, where min
//and max are our lower and higher limit of number.
//Output :
//Min : 50 Max:100
//58

package day9;
import java.util.Random;
import java.util.Scanner;


public class RandomNumberGeneration {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	System.out.println("Enter Lower Limit: ");
	int lower = sc.nextInt();
	System.out.println("Enter Higher Limit: ");
	int higher = sc.nextInt();
	
	System.out.println(r.nextInt(lower)+higher/2);
}
}
