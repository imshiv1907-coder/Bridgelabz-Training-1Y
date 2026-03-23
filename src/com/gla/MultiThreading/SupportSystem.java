
import java.util.Random;

class Ticket extends Thread {

    int ticketNo;
    String type;

    Ticket(int n, String t) {
        ticketNo = n;
        type = t;
    }

    public void run() {
        Random r = new Random();
        int time = r.nextInt(5) + 1;

        System.out.println("Ticket " + ticketNo + " (" + type + ") started by " + getName());
        System.out.println("Priority : " + getPriority());

        try {
            Thread.sleep(time * 1000);
        } catch (Exception e) {}

        System.out.println("Ticket " + ticketNo + " completed\n");
    }
}

public class SupportSystem {
    public static void main(String[] args) {

        Ticket t1 = new Ticket(1, "Critical Bug");
        Ticket t2 = new Ticket(2, "Feature Request");
        Ticket t3 = new Ticket(3, "General Query");
        Ticket t4 = new Ticket(4, "Feedback");
        Ticket t5 = new Ticket(5, "Critical Bug");
        Ticket t6 = new Ticket(6, "General Query");
        Ticket t7 = new Ticket(7, "Feature Request");
        Ticket t8 = new Ticket(8, "Critical Bug");
        Ticket t9 = new Ticket(9, "Feedback");
        Ticket t10 = new Ticket(10, "General Query");

        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(2);
        t4.setPriority(1);
        t5.setPriority(10);
        t6.setPriority(2);
        t7.setPriority(4);
        t8.setPriority(10);
        t9.setPriority(1);
        t10.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
