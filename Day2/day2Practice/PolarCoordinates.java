package day2Practice;
import java.util.Scanner;
public class PolarCoordinates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r1,r2,r3,t1,t2,t3,x1,x2,x3,y1,y2,y3, r,t;
		r1 = 6;
		t1 = 50;
		
		r2 = 7;
		t2 = 50;
		
		x1 = r1 * Math.cos(Math.toRadians(t1));
		y1 = r1 * Math.sin(Math.toRadians(t1));
		
		
		x2 = r2 * Math.cos(Math.toRadians(t2));
		y2 = r2 * Math.sin(Math.toRadians(t2));
		
		
		x3 = x1 + x2;
		y3 = y1 + y2;
		
		
		r3 = Math.sqrt((Math.pow(x3, 2)+Math.pow(y3, 2)));
		t3 = Math.atan(y3/x3);
		
		
//		
		
		System.out.println("Radius: "+r3);
		System.out.println("Theta: "+Math.toDegrees(t3));
		
		
		
		
		
		
//		System.out.println(x1);
		
		
	}
}
