package collectiondemo;

import java.util.ArrayList;
import java.util.PriorityQueue;

class prioChars implements Comparable<prioChars> {

	String c;
	int prio;

	prioChars(String s, int prio) {
		this.c = s;
		this.prio = prio;
	}

	public int compareTo(prioChars p1) {
		if (this.prio > p1.prio)
			return 1;
		if (this.prio < p1.prio)
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return "prioChars [c=" + c + ", prio=" + prio + "]";
	}
	
}

public class HuffmanCoding {
	public static void main(String[] args) {
		String str = "ABBABCDEDDCBA";
		PriorityQueue<prioChars> x = new PriorityQueue<prioChars>();

		char[] carr = str.toCharArray();
		int p = 1;
		for (int i = 0; i < str.length(); i++) {
			if (carr[i] != '0') {
				for (int j = i + 1; j < str.length(); j++) {
					if (carr[i] == carr[j]) {
						p++;
						carr[j] = '0';
					}
				}
			} else {
				continue;
			}

//			System.out.println(carr[i]+" "+p);
			x.add(new prioChars(Character.toString(carr[i]), p));
			p = 1;
		}
		
		while(x.size()>1) {
			int p1 = x.peek().prio;
			String a = x.poll().c;
			int p2 = x.peek().prio;
			String b = x.poll().c;
			String n =a+b;
			int p3 = p1+p2;
			x.add(new prioChars(n, p3));
			System.out.println(n+"  "+p3);
			
		}
		
		
		 
	    		prioChars s=x.poll();
	    		System.out.println(s);
	    		
	    	
	}

}
