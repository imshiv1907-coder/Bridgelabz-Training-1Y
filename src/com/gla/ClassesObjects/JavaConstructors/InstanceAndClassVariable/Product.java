package com.gla.InstanceAndClassVariable;

public class Product {
    private String productName;
    private double price;

    // Class variable (shared across all products)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    // Main method to test
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.0);
        Product product2 = new Product("Smartphone", 800.0);
        Product product3 = new Product("Headphones", 150.0);

        // Display details of each product
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();
        System.out.println();

        // Display total products
        Product.displayTotalProducts();
    }
}
