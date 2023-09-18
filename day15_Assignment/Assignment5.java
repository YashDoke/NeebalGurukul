
//Write a program to implement the Producer-Consumer problem.
//There are two processes, the producer and the consumer, which share a common,
//fixed-size buffer used as a queue. The producer’s job is to generate data, put it into
//the buffer, and start again.
//At the same time, the consumer is consuming the data (i.e. removing it from the
//buffer), one piece at a time.
//Problem :
//To make sure that the producer won’t try to add data into the buffer if it’s full and
//that the consumer won’t try to remove data from an empty buffer.

package day15_Assignment;


import java.util.Vector;

class ProducerConsumer {
    private Vector<Integer> buffer = new Vector<>();
    private int capacity = 5; // Buffer size

    public void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full. Producer waiting...");
            Thread.sleep(1000); 
        }

        System.out.println("Producer produced: " + item);
        buffer.add(item);
    }

    public int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer waiting...");
            Thread.sleep(1000);
        }

        int item = buffer.remove(0);
        System.out.println("Consumer consumed: " + item);
        return item;
    }
}

public class Assignment5  {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try {
                int item = 0;
                while (true) {
                    pc.produce(item++);
                    Thread.sleep(1000); 
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    pc.consume();
                    Thread.sleep(1000); 
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
