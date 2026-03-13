package Friday13.Multithreading_Practicals;

// RunnableExample.java
// Program to create a thread using Runnable interface
// It prints numbers from 1 to 10

// Creating a class that implements Runnable interface
class MyRunnable implements Runnable {

    // run() method contains the code executed by the thread
    public void run() {
        // Loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
    }
}

// Main class
public class RunnableExample {

    public static void main(String[] args) {

        // Creating object of MyRunnable class
        MyRunnable obj = new MyRunnable();

        // Creating Thread object and passing Runnable object
        Thread t1 = new Thread(obj);

        // Starting the thread
        t1.start();
    }
}
