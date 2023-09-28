package collectiondemo;

import java.util.ArrayDeque;

public class Palindrome {
	public static void main(String[] args) {
		String s="nittin";
//		char[] c=s.toCharArray();
		ArrayDeque<String> ad=new ArrayDeque();
	
		for (int i = 0; i < s.length(); i++) {
				ad.addFirst(Character.toString(s.charAt(i)));
		}
//		
//		int p = 1;
//		int k = s.length()%2 ==0? 0:1;
//		while(ad.size()!=k) {
//			if(!(ad.removeFirst().equals(ad.removeLast()))) {
//				p=0;
//				break;
//			}
//		}
//		
//		if(p==1) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("not palindrome");
//		}
		
		Iterator itr=ad.iterator()
	}
}
