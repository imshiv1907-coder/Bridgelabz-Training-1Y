
interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}

class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using Wallet: " + amount);
    }
}
