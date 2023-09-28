package collectiondemo;

import java.util.PriorityQueue;

public class PriorityQuesStudent2 {
	class Student  {
	    int roll;
	    String name;

	    Student(String s, int r) {
	        roll = r;
	        name = s;
	    }
	    public String toString() {
	        return "roll " + roll + " name " + name;
	    }
	}

	public class PriorityQueueDemo1 {
	    public static void main(String[] args) {
	        PriorityQueue<Student> x = new PriorityQueue<>(new Comparable<Student>() {
	        	public int compareTo(Student t) {
	        	    if (roll < t.roll) {
	                    return -1;
	                }
	                if (roll > t.roll) {
	                    return 1;
	                }
	                return 0;
	            }
	        	};
	        });
	        x.add(new Student("a", 7));
	        x.add(new Student("b", 8));
	        x.add(new Student("c", 9));
	        x.add(new Student("d", 10));
	        x.add(new Student("e", 11));
	        x.add(new Student("f", 6));

	        while (!x.isEmpty()) {
	            Student i = x.poll();
	            System.out.println(i);
	        }
	    }
	}
}
