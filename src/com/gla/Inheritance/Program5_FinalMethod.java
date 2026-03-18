class Bank {
    final void calculateInterest() {
        System.out.println("Fixed interest calculation");
    }
}
public class Program5_FinalMethod {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.calculateInterest();
    }
}