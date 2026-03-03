// BankAccount class
class BankAccount {

    // Attributes
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        displayBalance();
        System.out.println("----------------------------");
    }
}

// Main class
public class ATMSimulation {
    public static void main(String[] args) {

        // Creating a BankAccount object
        BankAccount account = new BankAccount("Alice", "ACC12345", 1000.00);

        // Display account details
        account.displayAccountDetails();

        // Perform transactions
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);  // Should show insufficient balance

        // Display final balance
        account.displayBalance();
    }
}