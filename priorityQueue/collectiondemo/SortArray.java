package collectiondemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortArray {
	public static void main(String[] args) {
		Integer[] arr= {8,7,4,5,9,2,11,4,5,8,7,5,6,1};
//		Arrays.sort(arr);
		Arrays.sort(arr,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2) {
					return 1;
				}
				if(o2>o1) {
					return -1;
				}
				return 0;
			}
			
		});
		int start = arr.length-5;
		int end = arr.length;
		Arrays.sort(arr,start,end,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2) {
					return -1;
				}
				if(o2>o1) {
					return 1;
				}
				return 0;
			}
			
		});
		System.out.println(Arrays.toString(arr));
	}
}
