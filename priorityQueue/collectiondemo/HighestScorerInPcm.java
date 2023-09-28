package collectiondemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//class Student2 implements  Comparable<Student2>{
	class Student2 implements Comparator<Student2>{
	String name;
	protected int roll;
	protected int marksInPhy;
	protected int marksInChe; 
	protected int marksInMath;
	protected int total;
	public Student2() {
		super();
	
	}
	Student2(String name,int roll,int marksInPhy,int marksInChe,int marksInMath){
		this.marksInPhy=marksInPhy;
		this.marksInChe=marksInChe;
		this.marksInMath=marksInMath;
		this.roll=roll;
		this.name=name;
		this.total=marksInPhy+marksInChe+marksInMath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarksInPhy() {
		return marksInPhy;
	}
	public void setMarksInPhy(int marksInPhy) {
		this.marksInPhy = marksInPhy;
	}
	public int getMarksInChe() {
		return marksInChe;
	}
	public void setMarksInChe(int marksInChe) {
		this.marksInChe = marksInChe;
	}
	public int getMarksInMath() {
		return marksInMath;
	}
	public void setMarksInMath(int marksInMath) {
		this.marksInMath = marksInMath;
	}
	
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marksInPhy=" + marksInPhy + ", marksInChe=" + marksInChe
				+ ", marksInMath=" + marksInMath +  " PCM "+ total+ "]";
	}

	

//	public int compareTo(Student2 o1) {
//		if(this.total>o1.marksInChe+o1.marksInMath+o1.marksInPhy)
//			return -1;
//		if(this.total<o1.marksInChe+o1.marksInMath+o1.marksInPhy)
//			return 1;
//		return 0;
//	}
	@Override
	public int compare(Student2 o1, Student2 o2) {
		
		if(o2.marksInChe+o2.marksInMath+o2.marksInPhy>o1.marksInChe+o1.marksInMath+o1.marksInPhy)
			return -1;
		if(o2.marksInChe+o2.marksInMath+o2.marksInPhy<o1.marksInChe+o1.marksInMath+o1.marksInPhy)
			return 1;
		return 0;
	}

	
	
}

public class HighestScorerInPcm {
	public static void main(String[] args) {
		
		Student2 []s = new Student2[6];
		s[0] = new Student2("a", 7,0,70,75);
		s[1] = new Student2("b", 8,75,87,27);
		s[2] = new Student2("c", 9,60,97,65);
		s[3] = new Student2("d", 10,76,86,51);
		s[4] = new Student2("e", 11,77,85,14);
		s[5] = new Student2("f", 12,78,84,42);
		
		
		Arrays.sort(s, s[0] );
		
        int i = 0;
        while(i<s.length) {

    		System.out.println(s[i]);
    		i++;
    	}
		
		
		
//		PriorityQueue<Student2> x= new PriorityQueue<Student2>();
//		    x.add(new Student2("a", 7,0,70,75));
//	        x.add(new Student2("b", 8,75,87,27));
//	        x.add(new Student2("c", 9,60,97,65));
//	        x.add(new Student2("d", 10,76,86,51)); 
//	        x.add(new Student2("e", 11,77,85,14));
//	        x.add(new Student2("f", 12,78,84,42));
//	        int i = 1;
//	        System.out.println("Top 3 Students in PCM: ");
//	        while(i<=3) {
//	    		Student2 s=x.poll();
//	    		System.out.println(s);
//	    		i++;
//	    	}
	        
	        
//		PriorityQueue<Student2> y= new PriorityQueue<>(new Comparator<Student2>() {
//
//			@Override
//			public int compare(Student2 o1, Student2 o2) {
//				if(o1.marksInMath>o2.marksInMath)
//					return -1;
//				if(o1.marksInMath<o2.marksInMath)
//					return 1;
//				return 0;
//			}
//			
//		});
		
//	        y.add(new Student2("a", 7,0,70,75));
//	        y.add(new Student2("b", 8,75,87,27));
//	        y.add(new Student2("c", 9,60,97,65));
//	        y.add(new Student2("d", 10,76,86,51)); 
//	        y.add(new Student2("e", 11,77,85,14));
//	        y.add(new Student2("f", 12,78,84,42));
//	        i = 1;
//	        System.out.println("Top 3 Students in Maths: ");
//	        while(i<=3) {
//	    		Student2 s=y.poll();
//	    		System.out.println(s);
//	    		i++;
//	    	}
	}
	
	
	
}
