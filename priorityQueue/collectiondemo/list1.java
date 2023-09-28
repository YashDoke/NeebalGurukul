package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class list1 {
	public static void main(String[] args) {
//		List<Integer> list= Arrays.asList(8,15,7,-2,15,4,2,9,12,8,2,11,15);
		
ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(8,15,7,-2,15,4,2,9,12,8,2,11,15));
//list1.addAll(list);
		
		int k=4;
	    System.out.println(ksum(list1,k));
		
		

	}
	
	static List<Integer> ksum(List<Integer> list,int k){
		ArrayList<Integer> sum = new ArrayList<Integer>();
		int s=0; int c=0;
		while(!list.isEmpty()) {
			s+= list.remove(0);
			c++;
			if(c==k) {
				sum.add(s);
				s=0;
				c=0;
			}
		}
		return sum;
	}
}
