//Question 6:
//WAP to create 2 sets, one containing multiple of 5 less than 30 and another
//containing
//multiple of 3 less than 20. Display the following:
//I. Union of 2 sets and its length
//II. Intersection of 2 sets and its length
//III. Difference of set1 and set2 and its length



package setsAndMapsAssignment;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumberMultipleSet {
    public static Set<Integer> findUnion(Set<Integer> m5, Set<Integer> m3) {
        Set<Integer> union = new HashSet<>(m5);
        union.addAll(m3);
        return union;
    }

    public static Set<Integer> findIntersection(Set<Integer> m5, Set<Integer> m3) {
        Set<Integer> intersection = new HashSet<>(m5);
        intersection.retainAll(m3);
        return intersection;
    }

    public static Set<Integer> findDifference(Set<Integer> m5, Set<Integer> m3) {
        Set<Integer> difference = new HashSet<>(m5);
        difference.removeAll(m3);
        return difference;
    }

    public static void main(String[] args) {

        Set<Integer> m5 = new TreeSet<>();
        for (int i = 5; i < 30; i += 5) {
            m5.add(i);
        }
        Set<Integer> m3 = new TreeSet<>();
        for (int i = 3; i < 20; i += 3) {
            m3.add(i);
        }

        Set<Integer> unionSet = findUnion(m5, m3);
        Set<Integer> intersectionSet = findIntersection(m5, m3);
        Set<Integer> differenceSet = findDifference(m5, m3);

    
        System.out.println("Union of 2 sets: " + unionSet);
        System.out.println("Length: " + unionSet.size());

        System.out.println("Intersection of 2 sets: " + intersectionSet);
        System.out.println("Length: " + intersectionSet.size());

        System.out.println("Difference of 2 sets: " + differenceSet);
        System.out.println("Length: " + differenceSet.size());
    }
}
