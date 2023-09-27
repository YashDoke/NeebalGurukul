//Question 3:
//Write an algorithm to determine if a number n is happy.
//A happy number is a number defined by the following process:
//• Starting with any positive integer, replace the number by the sum of the
//squares of its digits.
//• Repeat the process until the number equals 1 (where it will stay), or it loops
//endlessly in a cycle which does not include 1.
//• Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.
//Example 1:
//Input: n = 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
//Example 2:
//Input: n = 2
//Output: false
//Constraints:
//1 <= n <= 231

package setsAndMapsAssignment;


import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n1 = 19;
        int n2 = 2;

        System.out.println( n1 + " " + isHappy(n1)); 
        System.out.println( n2 + "  " + isHappy(n2)); 
        
//        printing just for my information
        int num = 1;
        while(num<101) {
        	if(isHappy(num)) {
        		System.out.print(num+" ");
        		
        	}
        	num++;
        }
}}
