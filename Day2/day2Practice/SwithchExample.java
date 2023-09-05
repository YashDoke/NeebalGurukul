package day2Practice;
import java.util.Scanner;
public class SwithchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area=0;
		System.out.println("Enter shape: ");
		String shape = sc.nextLine();
		
		switch(shape) {
		
		case "CIRCLE":
		case "circle":
			System.out.println("Enter Radius: ");
			int radius = sc.nextInt();
			area = 3.142*radius*radius;
			break;
		case "RECTANGLE":
		case "rectangle":
			System.out.println("Enter Length: ");
			int length = sc.nextInt();
			System.out.println("Enter width: ");
			int width = sc.nextInt();
			area= length * width;
			break;
		case "SQUARE":
		case "square":
			System.out.println("Enter Side: ");
			int side = sc.nextInt();
			area = side * side;
			break;
		default:
			System.out.println("none");
		}
		
		System.out.println("Area of "+shape+" "+area);
	}
}
