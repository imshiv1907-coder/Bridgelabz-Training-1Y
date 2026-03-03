package com.gla.ObjectsAndClasses.Level2;

import java.util.ArrayList;

// Class to represent each item in the cart
class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate total price for this item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Display item details
    public void displayItem() {
        System.out.println(itemName + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + getTotalPrice());
    }
}

// Class to manage the shopping cart
class ShoppingCart {
    private ArrayList<CartItem> cartItems;

    // Constructor
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Add item to cart
    public void addItem(CartItem item) {
        cartItems.add(item);
        System.out.println(item.getItemName() + " added to the cart.");
    }

    // Remove item from cart by name
    public void removeItem(String itemName) {
        boolean removed = cartItems.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
        if (removed) {
            System.out.println(itemName + " removed from the cart.");
        } else {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Display total cost
    public void displayTotalCost() {
        double total = 0;
        System.out.println("\nCart Details:");
        for (CartItem item : cartItems) {
            item.displayItem();
            total += item.getTotalPrice();
        }
        System.out.println("Total Cart Cost: $" + total);
        System.out.println("----------------------------");
    }
}

// Main class
public class ShoppingCartProgram {
    public static void main(String[] args) {

        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add items
        cart.addItem(new CartItem("Laptop", 750.00, 1));
        cart.addItem(new CartItem("Mouse", 25.50, 2));
        cart.addItem(new CartItem("Keyboard", 45.00, 1));

        // Display cart
        cart.displayTotalCost();

        // Remove an item
        cart.removeItem("Mouse");

        // Display cart again
        cart.displayTotalCost();
    }
}