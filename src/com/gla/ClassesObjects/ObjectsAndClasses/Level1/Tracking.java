package com.gla.ObjectsAndClasses.Level1;
// Item class
class Item {
    // Attributes
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code  : " + itemCode);
        System.out.println("Item Name  : " + itemName);
        System.out.println("Price      : $" + price);
    }

    // Method to calculate total cost
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class Tracking {
    public static void main(String[] args) {
        // Creating an object of Item
        Item item1 = new Item("I101", "Laptop", 750.00);

        // Display item details
        item1.displayItemDetails();

        // Calculate total cost
        int quantity = 3;
        double totalCost = item1.calculateTotalCost(quantity);

        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : $" + totalCost);
    }
}
