# java-multithreading-file-handling-practicals


# Java Multithreading and File Handling Practicals

This project contains simple Java programs to understand **Multithreading** and **File Handling**.


1. Thread Creation

Create threads using:

* Thread class
* Runnable interface

The program prints numbers **1 to 10**.


2. Multiple Threads

Create two threads:

* **Thread 1** → prints even numbers
* **Thread 2** → prints odd numbers

Both threads run at the same time.

3. Thread Synchronization

Create a **BankAccount class** with two threads:

* `deposit()`
* `withdraw()`

The **synchronized** keyword is used to keep the **balance correct**.


4. Thread Sleep Example

Create a thread that prints numbers **1 to 5**.

The thread pauses **1 second** between numbers using:

Thread.sleep(1000)


5. Write File

Write student details into a file:

students.txt

Example data:

* ID
* Name
* Course
* City


6. Read File

Read and print the contents of:

students.txt

The program reads the file and shows the data on the console.


# Concepts Used

* Multithreading
* Thread class
* Runnable interface
* Synchronization
* Thread.sleep()
* FileWriter
* FileReader
* BufferedReader
* Exception Handling
