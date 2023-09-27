package setsAndMapsAssignment;

import java.util.HashSet;
import java.util.Set;

public class UniqueVowels {
	public static Set<Character> findUniqueVowels(Set<Character> s ,Set<Character> t) {
		s.retainAll(t);
		return s;
		
	}
public static void main(String[] args) {
	Set<Character> s = new HashSet<>();
	s.add('a');
	s.add('e');
	s.add('i');
	s.add('o');
	s.add('u');
	s.add('A');
	s.add('E');
	s.add('I');
	s.add('O');
	s.add('U');
	
	Set<Character> t = new HashSet<>();
	t.add('a');
	t.add('D');
	t.add('e');
	t.add('q');
	t.add('y');
	t.add('r');
	t.add('H');
	t.add('i');
	t.add('O');
	t.add('E');
	t.add('A');
	t.add('X');
	t.add('U');
	
	
	Set<Character> ans = findUniqueVowels(s,t);
	System.out.println(ans);
	
	
	
	
}
}
