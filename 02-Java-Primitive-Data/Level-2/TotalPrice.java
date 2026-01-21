import java.util.Scanner;

public class TotalPrice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input unit price and quantity
        System.out.print("Enter the unit price: ");
        float unitPrice = sc.nextFloat();

        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        // Calculate total price
        float totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice
                + " if the quantity " + quantity
                + " and unit price is INR " + unitPrice);

        sc.close();
    }
}
