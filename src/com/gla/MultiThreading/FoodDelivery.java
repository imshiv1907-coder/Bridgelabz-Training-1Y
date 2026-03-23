
class Order implements Runnable {

    int id;
    String restaurant;
    int deliveryTime;

    Order(int i, String r, int t) {
        id = i;
        restaurant = r;
        deliveryTime = t;
    }

    public void run() {
        try {
            System.out.println("Order " + id + " picked up from " + restaurant);
            Thread.sleep(deliveryTime * 1000);

            System.out.println("Order " + id + " in transit...");
            Thread.sleep(deliveryTime * 1000);

            System.out.println("Order " + id + " delivered by " + Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Order(1, "Pizza Hut", 2));
        Thread t2 = new Thread(new Order(2, "Dominos", 3));
        Thread t3 = new Thread(new Order(3, "Burger King", 4));
        Thread t4 = new Thread(new Order(4, "KFC", 2));
        Thread t5 = new Thread(new Order(5, "Subway", 3));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);
        t4.setPriority(10);
        t5.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
