//2) Write a program to create two threads which prints even and odd numbers till 20 in a
//sequence.

package day15_Assignment;
public class Assignment2 {
	
    int count = 1;
 
    static int num;
 
   
    public void printOddNumber()
    {
        synchronized (this)
        {
         
            while (count < num) {
 
                
                while (count % 2 == 0) {
 
                   
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
 
               
                System.out.print(count + " ");
 
                
                count++;
 
                
                notify();
            }
        }
    }
 
    
    public void printEvenNumber()
    {
        synchronized (this)
        {
            while (count < num) {
                while (count % 2 == 1) {
                    try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.print(count + " ");
                count++;
                notify();
            }
        }
    }
public static void main(String[] args) {
	
    num = 20;

   
      Assignment2 as = new Assignment2();
      

    
    Thread t1 = new Thread(new Runnable() {
        public void run()
        {
            as.printEvenNumber();
        }
    });

    
    Thread t2 = new Thread(new Runnable() {
        public void run()
        {
            as.printOddNumber();
        }
    });
    t1.start();
    t2.start();
}
}
