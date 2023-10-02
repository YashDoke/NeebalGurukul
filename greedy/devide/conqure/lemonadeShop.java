package com.greedy.devide.conqure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class lemonadeShop {
	public static boolean haveChange(int bills[]) {
		Queue<Integer> billQueue =  new LinkedList<>();
		for(int bill:bills) {
			if(bill ==5) {
				billQueue.offer(5);
			}else if(bill==10) {
				if(!billQueue.isEmpty()&&billQueue.contains(5)) {
					billQueue.remove(5);
					billQueue.offer(10);
				}else {
					return false;
				}
			}else if(bill==20) {
				if(billQueue.contains(10)&&billQueue.contains(5)) {
					billQueue.remove(10);
					billQueue.remove(5);
				}else if(billQueue.size()>=3 && billQueue.contains(5)) {
					billQueue.remove(5);
					billQueue.remove(5);
					billQueue.remove(5);
				}else {
					return false;
				}
			}
		}	
		return true;
	}
public static void main(String[] args) {
//	int bills[] = {5,5,5,10,20};
	int bills[] = {5,5,10,10,20};
	boolean result = haveChange(bills);
	System.out.println(result);
	
}
}
