
class SavingsAccount extends BankAccount implements Loanable{

    public SavingsAccount(int accNo,String name,double balance){

        super(accNo,name,balance);
    }

    public double calculateInterest(){
        return balance*0.04;
    }

    public void applyForLoan(double amount){
        System.out.println("Loan Applied: "+amount);
    }

    public boolean calculateLoanEligibility(){
        return balance>5000;
    }
}
