class Order
{
    int orderId;
    String orderDate;
}

class ShippedOrder extends Order
{
    String trackingNumber;
}

class DeliveredOrder extends ShippedOrder
{
    String deliveryDate;

    void getOrderStatus()
    {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Order Status: Delivered");
    }
}

public class OrderSystem
{
    public static void main(String[] args)
    {
        DeliveredOrder d = new DeliveredOrder();

        d.orderId = 1001;
        d.orderDate = "10-03-2026";
        d.trackingNumber = "TRK56789";
        d.deliveryDate = "12-03-2026";

        d.getOrderStatus();
    }
}