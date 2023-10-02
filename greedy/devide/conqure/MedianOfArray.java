package com.greedy.devide.conqure;

import java.util.Arrays;

public class MedianOfArray {
	public static double findMedian(int nums1[], int nums2[]) {
		int i=0,j=0,k=0;
		int merged[] = new int[nums1.length+nums2.length];
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<=nums2[j]) {
				merged[k++] = nums1[i++];
			}else {
				merged[k++] = nums2[j++];
			}
		}
		while(i<nums1.length) {
			merged[k++] = nums1[i++];
		}
		
		while(j<nums2.length) {
			merged[k++] = nums2[j++];
		}
		
		if(merged.length%2!=0) {
			return merged[(merged.length/2)];
		}

		return (merged[(merged.length/2)-1]+merged[(merged.length/2)])/2.0;
	}
public static void main(String[] args) {
	int nums1[] = {1,2};
	int nums2[] = {3,4};
	double median = findMedian(nums1, nums2);
	System.out.println(median);
}
}
