//1) Define an Exception called “NoMatchException” that is thrown when a string is not
//equal to ‘India’. Write a program that uses this exception.
package day11_Assignment;

import java.util.Scanner;

class NoMatchException extends Exception{
	String error;  
    NoMatchException(String message)  
    {  
         error = message;  
    }  
 
    public String toString() {
		return error; 
	}
}

public class Exception1 {
public static void main(String[] arrgs) throws Exception {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String str = sc.nextLine();
	
	
          try  
          {  
               if(str.compareTo("India") == 0)  
               {  
                    System.out.println("String is equal to 'India'.");  
               }  
               else  
               {  
                    throw new NoMatchException("String is not equal to 'India'");  
               }  
          }  
          catch(NoMatchException e)  
          {  
               System.out.println("Exception Caught: "+e);  
                
          }  
          
     }  
}

