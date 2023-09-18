//1) Write a program to create multiple threads ( One thread must display alphabets and
//the another thread must display numbers)
package day15_Assignment;

class AlphabateThread extends Thread {

	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class NumberThread extends Thread {
	public void run() {
		for (int i = 1; i <= 26; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		AlphabateThread a =  new AlphabateThread();
		NumberThread  n = new NumberThread();
		
		Thread alpha = new Thread(a);
		Thread number = new Thread(n);
		
		alpha.start();
		number.start();
	}
}
