//Create a multithreaded program by using Runnable interface and then create,
//intialize and start three Thread objects from your class. The threads will execute
//concurrently and display the following String array elements.
//String course[] ={“Java”, “J2EE”, “Spring”, ”Struts”};

package day15_Assignment;

public class Assignment4 implements Runnable {
	
	private static String[] course = {"Java", "J2EE", "Spring", "Struts"};
    private int index;

    public Assignment4(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        for (int i = index; i < course.length; i += 3) {
            System.out.println(course[i]);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	
public static void main(String[] args) {
	Thread thread1 = new Thread(new Assignment4(0));
    Thread thread2 = new Thread(new Assignment4(1));
    Thread thread3 = new Thread(new Assignment4(2));

    
    thread1.start();
    thread2.start();
    thread3.start();
}
}


