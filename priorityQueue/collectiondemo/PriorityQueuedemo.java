package collectiondemo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuedemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> x= new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer x, Integer y) {
				if(x>y) {
					return -1;
				}
				if(y>x) {
					return 1;
				}
				else return 0;
			}
		});
		x.add(10);
		x.add(7);
		x.add(100);
		x.add(23);
		x.add(78);
		x.add(12);
		x.add(56);
		
		while(!x.isEmpty()) {
			int i = x.poll();
		System.out.println(i);	
		}
		
	}
}
