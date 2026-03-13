package Friday13.Multithreading_Practicals;

// MultipleThreadsExample.java
// Program to create two threads
// Thread 1 prints even numbers
// Thread 2 prints odd numbers

// Thread class to print even numbers
class EvenThread extends Thread {

    // run() method contains the code executed by the thread
    public void run() {

        // Loop to print even numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println("Even Number: " + i);
            }

        }
    }
}

// Thread class to print odd numbers
class OddThread extends Thread {

    // run() method contains the code executed by the thread
    public void run() {

        // Loop to print odd numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {

            if (i % 2 != 0) {
                System.out.println("Odd Number: " + i);
            }

        }
    }
}

// Main class
public class MultipleThreadsExample {

    public static void main(String[] args) {

        // Creating objects of both threads
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        // Starting both threads
        t1.start();
        t2.start();
    }
}
