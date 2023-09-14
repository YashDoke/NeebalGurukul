//3)Write a program that prompts user to read two integers and display their sum. Your
//program should prompt the user to read the number again if the input is incorrect.

package day11_Assignment;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		boolean validInput = false;

		while (!validInput) {
			try {
				System.out.print("Enter the first integer: ");
				num1 = sc.nextInt();
				System.out.print("Enter the second integer: ");
				num2 = sc.nextInt();
				validInput = true; 
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter integers only.");
				sc.nextLine(); 
			}
		}

		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

	}
}