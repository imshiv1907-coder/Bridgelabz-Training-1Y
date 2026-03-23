
class BankAccount implements Runnable {

    String name;
    String type;

    BankAccount(String n, String t) {
        name = n;
        type = t;
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + " (" + type + ") is checking balance...");
                System.out.println("Thread Name : " + Thread.currentThread().getName());
                System.out.println("Priority : " + Thread.currentThread().getPriority());
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {

        BankAccount p = new BankAccount("Sarthak", "Premium");
        BankAccount r = new BankAccount("Rahul", "Regular");
        BankAccount b = new BankAccount("Aman", "Basic");

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(b);

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
