package Friday13.Multithreading_Practicals;

// ThreadExample.java
// Program to create a thread using Thread class
// It prints numbers from 1 to 10

// Creating a class that extends Thread
class MyThread extends Thread {

    // run() method contains the code that will be executed by the thread
    public void run() {
        // Loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }
    }
}

// Main class
public class ThreadExample {

    public static void main(String[] args) {

        // Creating object of MyThread class
        MyThread t1 = new MyThread();

        // start() method starts the thread and internally calls run()
        t1.start();
    }
}
