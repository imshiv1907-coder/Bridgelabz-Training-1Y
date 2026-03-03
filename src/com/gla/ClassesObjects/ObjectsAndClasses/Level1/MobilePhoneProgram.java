package com.gla.ObjectsAndClasses.Level1;

// MobilePhone class
class MobilePhone {

    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : $" + price);
        System.out.println("------------------------");
    }
}

// Main class
public class MobilePhoneProgram {
    public static void main(String[] args) {

        // Creating MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 999.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 14", 1099.99);

        // Displaying details
        phone1.displayDetails();
        phone2.displayDetails();
    }
}