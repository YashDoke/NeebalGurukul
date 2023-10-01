package queueAssignments;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        
      
        for (int num : nums) {
          
            if (pq.size() < k) {
                pq.offer(num);
            } else {
               
                if (num > pq.peek()) {
                    pq.poll();
                    pq.offer(num);
                }
            }
        }
      
        return pq.peek();
    }
    
    public static void main(String[] args) {
    	
        KthLargestElement solution = new KthLargestElement();
        
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println(solution.findKthLargest(nums1, k1));
        
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println(solution.findKthLargest(nums2, k2));
    }
}
