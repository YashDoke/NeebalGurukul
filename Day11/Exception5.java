//5) Write a Java program that reads a list of integers from the user and throws an
//exception if any numbers are duplicates.
//Input the Integers 1 2 3 3 4 5
//Error: Duplicate number found: 3
//Input 1 2 3 4 5 6
//No duplicate numbers!
package day11_Assignment;
import java.util.Scanner;
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}
public class Exception5 {
	public static boolean hasDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter integers : "); // please Enter Number seperated by comma
    String str = sc.nextLine();

    try {
        String[] numbers = str.split(" ");
        int[] intArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            intArray[i] = Integer.parseInt(numbers[i]);
        }
    	
//    	****this is directly taking integer arguments**********
//    	System.out.println("Enter length of Integer Array: ");
//    	int n = sc.nextInt();
//    	int[] intArray = new int[n];
//    	System.out.println("Enter Number of Integers: ");
//    	for(int i=0;i<n;i++) {
//    		intArray[i]=sc.nextInt();
//    	}
    	

        if (hasDuplicates(intArray)) {
            throw new DuplicateNumberException("Duplicate number found!");
        }

        System.out.println("No duplicate numbers!");
    } catch (NumberFormatException e) {
        System.out.println("Error: Invalid input. Please enter integers ");
    } catch (DuplicateNumberException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}
