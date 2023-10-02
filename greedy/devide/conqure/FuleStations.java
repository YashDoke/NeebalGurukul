package com.greedy.devide.conqure;


import java.util.Collections;
import java.util.PriorityQueue;
public class FuleStations {
	public static  int minRefuelStops(int target, int startFuel, int[][] stations) {
        int currentFuel = startFuel;
        int refuelingStops = 0;
        int position = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int[] station : stations) {
            int stationPosition = station[0];
            int stationFuel = station[1];

            while (position + currentFuel < stationPosition) {
                if (maxHeap.isEmpty()) {
                    return -1;
                }
                currentFuel += maxHeap.poll();
                refuelingStops++;
            }

            maxHeap.offer(stationFuel);
        }

        while (position + currentFuel < target) {
            if (maxHeap.isEmpty()) {
                return -1;
            }
            currentFuel += maxHeap.poll();
            refuelingStops++;
        }

        return refuelingStops;
    }
public static void main(String[] args) {
//	int target = 100;
//	int startFuel = 1;
//	int stations[][] = {{10,100}};
	
//	int target = 100;
//	int startFuel = 10;
//	int stations[][] = {{10,60},{20,30},{30,30},{60,40}};
	
	int target = 1;
	int startFuel = 1;
	int stations[][] = {};
	
	int stops = minRefuelStops(target,startFuel,stations);
	System.out.println(stops);
}
}



