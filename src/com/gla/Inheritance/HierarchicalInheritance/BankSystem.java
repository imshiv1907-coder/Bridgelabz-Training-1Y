class BankAccount
{
    int accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount
{
    double interestRate;

    void displayAccountType()
    {
        System.out.println("This is a Savings Account");
    }
}

class CheckingAccount extends BankAccount
{
    int withdrawalLimit;

    void displayAccountType()
    {
        System.out.println("This is a Checking Account");
    }
}

class FixedDepositAccount extends BankAccount
{
    int term;

    void displayAccountType()
    {
        System.out.println("This is a Fixed Deposit Account");
    }
}

public class BankSystem
{
    public static void main(String[] args)
    {
        SavingsAccount s = new SavingsAccount();
        CheckingAccount c = new CheckingAccount();
        FixedDepositAccount f = new FixedDepositAccount();

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}