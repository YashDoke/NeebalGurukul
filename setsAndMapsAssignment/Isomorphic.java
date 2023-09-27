//
//Question 4:
//Given two strings s and t, determine if they are isomorphic.
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//All occurrences of a character must be replaced with another character while
//preserving the order of characters. No two characters may map to the same
//character, but a character may map to itself.

//Example 1:
//Input: s = "egg", t = "add"
//Output: true
//Example 2:
//Input: s = "foo", t = "bar"
//Output: false
//Example 3:
//Input: s = "paper", t = "title"
//Output: true
//Constraints:
//1 <= s.length <= 5 * 104
//t.length == s.length
//s and t consist of any valid ascii character.

package setsAndMapsAssignment;

import java.util.HashMap;

public class Isomorphic {
public static boolean checksIomorphic(String s, String t) {
	HashMap<Character,Character> hm = new HashMap<>();
	
	for(int i=0;i<s.length();i++) {
			if(!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), t.charAt(i));
			}
	}
	
	String isoWord = "";
	for(int i=0;i<s.length();i++) {
		isoWord += hm.get(s.charAt(i));
	}
//	System.out.println(isoWord);
	if(isoWord.equals(t)) {
		return true;
	}else {
		return false;
	}
}
	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
//		s = "egg"; t = "add";
//		s = "foo"; t = "bar";
		System.out.println(checksIomorphic(s, t));
	}
}


