//8) Validate IP Address: Implement a program to validate if a given string is a valid IP address or
//not.
//. Validate IP Address: Test Case 1: Input: "192.168.0.1" Expected Output: True
//Test Case 2: Input: "256.256.256.256" Expected Output: False
//Test Case 3: Input: "192.168.0.256" Expected Output: False
//Test Case 4: Input: "12.34.56.789" Expected Output: False

package day9;

import java.util.Scanner;

public class ValidateIPAddress {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Ip Address: ");
		String ip = sc.nextLine();
		boolean flag = true;
		
		if (ip == null || ip.isEmpty()) {
			flag = false;
			
        }

        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
        	flag = false; // An IP address should have exactly 4 parts
        }

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) {
                	flag = false; // Each part should be between 0 and 255
                }
                
                if (part.length() > 1 && part.startsWith("0")) {
                	flag =false;
                }
            } catch (NumberFormatException e) {
            	flag =false; // Not a valid integer
            }
        }

        if(flag) {
        	System.out.println("True");
        }else {
        	System.out.println("Flase");
        }
//        flag =true;
		
	}

}
