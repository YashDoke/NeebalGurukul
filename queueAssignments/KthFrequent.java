package queueAssignments;

import java.util.*;

public class KthFrequent {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));

        for (int num : frequencyMap.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>(minHeap);

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        System.out.println("Example 1 Output: " + topKFrequent(nums1, k1)); // Output: [1, 2]

        int[] nums2 = {1};
        int k2 = 1;
        System.out.println("Example 2 Output: " + topKFrequent(nums2, k2)); // Output: [1]
    }
}
