package Friday13.Multithreading_Practicals;

// BankAccountSynchronization.java
// Program to demonstrate thread synchronization using a BankAccount example

// BankAccount class
class BankAccount {

    int balance = 1000;   // Initial balance

    // synchronized method to deposit money
    synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance after deposit: " + balance);
    }

    // synchronized method to withdraw money
    synchronized void withdraw(int amount) {

        // Check if balance is sufficient
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Thread class for Deposit
class DepositThread extends Thread {

    BankAccount account;

    // Constructor
    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(500);
    }
}

// Thread class for Withdraw
class WithdrawThread extends Thread {

    BankAccount account;

    // Constructor
    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(300);
    }
}

// Main class
public class BankAccountSynchronization {

    public static void main(String[] args) {

        // Creating shared BankAccount object
        BankAccount account = new BankAccount();

        // Creating threads
        DepositThread t1 = new DepositThread(account);
        WithdrawThread t2 = new WithdrawThread(account);

        // Starting threads
        t1.start();
        t2.start();
    }
}
