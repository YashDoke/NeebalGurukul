package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ReverseTheListFromk {
	public static void main(String[] args) {

		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(8,15,7,-2,15,4,2,9,12,8,2,45));
		int k = 4;
		System.out.println(kRev(list1, k));
	}	
	
	static List<Integer> kRev(List<Integer> list,int k){
		Stack<Integer> s = new Stack<>();
		ArrayList<Integer> rev = new ArrayList<>();
		
//		int c = 0;
//		while(!list.isEmpty()) {
//			s.push(list.remove(0));
//			c++;
//			if(c==k) {
//				while(!s.empty()) {
//					rev.add(s.pop());
//				}
//				s.clear();
//				c = 0;
//			}
		
//		alternate ways using collection classs method
		int i = 0;
		int j = 0;
		while(j<=list.size()-k) {
			j += k;
			List<Integer> li = list.subList(i, j);
			Collections.reverse(li);
			rev.addAll(li);
			i+=4;
		}
		
		return rev;
	}
}
