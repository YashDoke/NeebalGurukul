package com.greedy.devide.conqure;


import java.util.*;

public class ClosestPointToCenter  {
    public static int[][] kClosest(int[][] points, int k) {
       
        Comparator<int[]> comparator = (p1, p2) -> {
            double dist1 = Math.sqrt(p1[0] * p1[0] + p1[1] * p1[1]);
            double dist2 = Math.sqrt(p2[0] * p2[0] + p2[1] * p2[1]);
            return Double.compare(dist1, dist2);
        };

        PriorityQueue<int[]> pq = new PriorityQueue<>(comparator);

        for (int[] point : points) {
            pq.offer(point);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        
        
        
        int[][] result = new int[k][2];
        int i = 0;
        while (!pq.isEmpty()) {
            result[i++] = pq.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] points1 = {{1, 3}, {-2, 2}};
        int k1 = 1;
        int[][] closest1 = kClosest(points1, k1);
        System.out.println(Arrays.deepToString(closest1)); 

        int[][] points2 = {{3, 3}, {5, -1}, {-2, 4}};
        int k2 = 2;
        int[][] closest2 = kClosest(points2, k2);
        System.out.println(Arrays.deepToString(closest2)); 
    }
}
