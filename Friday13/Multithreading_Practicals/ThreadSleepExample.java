package Friday13.Multithreading_Practicals;

// ThreadSleepExample.java
// Program to demonstrate Thread.sleep()
// The thread prints numbers from 1 to 5 with a pause of 1 second

// Creating a thread class
class MyThread extends Thread {

    // run() method contains the code executed by the thread
    public void run() {

        // Loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {

            System.out.println("Number: " + i);

            try {
                // Pause the thread for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
                // Handling exception
                System.out.println(e);
            }

        }
    }
}

// Main class
public class ThreadSleepExample {

    public static void main(String[] args) {

        // Creating thread object
        MyThread t1 = new MyThread();

        // Starting the thread
        t1.start();
    }
}