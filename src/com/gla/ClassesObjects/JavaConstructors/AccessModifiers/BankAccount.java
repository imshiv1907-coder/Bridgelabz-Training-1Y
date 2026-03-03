package com.gla.AccessModifiers;

public class BankAccount {

        public String accountNumber;

        // Protected member
        protected String accountHolder;

        // Private member
        private double balance;

        // Constructor
        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        // Public method to get balance
        public double getBalance() {
            return balance;
        }

        // Public method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited $" + amount + " successfully.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Public method to withdraw money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + " successfully.");
            } else {
                System.out.println("Invalid withdrawal amount or insufficient balance.");
            }
        }

        // Display account details
        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: $" + balance);
            System.out.println("------------------------");
        }


    // Subclass
    class SavingsAccount extends BankAccount {
        private double interestRate; // in %

        // Constructor
        public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
            super(accountNumber, accountHolder, balance);
            this.interestRate = interestRate;
        }

        // Display savings account details
        public void displaySavingsAccountDetails() {
            // Accessing public and protected members
            System.out.println("Savings Account Number: " + accountNumber); // public
            System.out.println("Account Holder: " + accountHolder);        // protected
            System.out.println("Balance: $" + getBalance());               // private via public method
            System.out.println("Interest Rate: " + interestRate + "%");
            System.out.println("------------------------");
        }
    }

    // Main class to test
    class BankManagementSystem {
        public static void main(String[] args) {
            // Base account
            BankAccount acc1 = new BankAccount("ACC1001", "Alice", 5000.0);
            acc1.displayAccountDetails();

            acc1.deposit(1000.0);
            acc1.withdraw(2000.0);
            System.out.println("Balance after transactions: $" + acc1.getBalance());
            System.out.println();

            // Savings account
            SavingsAccount savAcc = new SavingsAccount("SAV2001", "Bob", 8000.0, 4.5);
            savAcc.displaySavingsAccountDetails();

            // Test deposit and withdraw on savings account
            savAcc.deposit(500.0);
            savAcc.withdraw(1000.0);
            System.out.println("Balance after transactions: $" + savAcc.getBalance());
        }
    }
}
