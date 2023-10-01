package queueAssignments;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeKSortedLists {
    public int[] mergeKArrays(int[][] arrays) {
        if (arrays == null || arrays.length == 0) {
            return new int[0];
        }

      
        PriorityQueue<Element> minHeap = new PriorityQueue<>(Comparator.comparingInt(element -> element.value));

       
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != null && arrays[i].length > 0) {
                minHeap.offer(new Element(i, 0, arrays[i][0]));
            }
        }

        List<Integer> resultList = new ArrayList<>();

        
        while (!minHeap.isEmpty()) {
            Element element = minHeap.poll();
            resultList.add(element.value);

           
            int nextIndex = element.index + 1;
            if (nextIndex < arrays[element.arrayIndex].length) {
                minHeap.offer(new Element(element.arrayIndex, nextIndex, arrays[element.arrayIndex][nextIndex]));
            }
        }

     
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        MergeKSortedLists solution = new MergeKSortedLists();

        int[][] arrays1 = {
            {1, 4, 5},
            {1, 3, 4},
            {2, 6}
        };
        int[] result1 = solution.mergeKArrays(arrays1);
        printArray(result1);

        int[][] arrays2 = {};
        int[] result2 = solution.mergeKArrays(arrays2);
        printArray(result2);

        int[][] arrays3 = {{}};
        int[] result3 = solution.mergeKArrays(arrays3);
        printArray(result3);
    }

    public static void printArray(int[] arr) {
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }

    static class Element {
        int arrayIndex;
        int index;
        int value;

        Element(int arrayIndex, int index, int value) {
            this.arrayIndex = arrayIndex;
            this.index = index;
            this.value = value;
        }
    }
}
