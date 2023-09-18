//3) Write a program to create two threads. In this class we have one constructor used to
//start the threads and run it. Check whether these two threads are run or not.


package day15_Assignment;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread " + getId() + " is running.");
    }
}
public class Assignment3 {
	public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

      
        System.out.println("Main thread is running.");
    }
}
