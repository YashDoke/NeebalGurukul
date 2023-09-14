//Write a program that meets the following requirements:
//Create an array with 100 randomly chosen integers. Prompt the user to enter the
//index of the array, then display the corresponding element value. If the specified
//index is out of bounds, display the message Out of Bounds.

package day11_Assignment;
import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Random;
import java.util.Scanner;

class OutofBound extends Exception{
	
	public String toString() {
		
		return "Exception caught: ArrayIndexOutOfBound";
	}
}
public class Exception4 {
	
	
	public static void main(String[] args) throws Exception {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = random.nextInt(1000);
		}



			try {
				System.out.print("Enter the index of the array (0-99): ");
				int index = sc.nextInt();

				if (index >= 0 && index < arr.length) {
					int element = arr[index];
					System.out.println("Element at index " + index + ": " + element);
				} else {
					throw new OutofBound();
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid index (0-99).");
			}
		

	}

}
