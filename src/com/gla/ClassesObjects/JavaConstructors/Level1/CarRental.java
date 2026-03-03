package com.gla.JavaConstructors.Level1;

// CarRental.java
public class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    // Display rental details
    public void displayRentalInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    // Main method to test
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Alice", "Toyota Camry", 5, 45.0);
        CarRental rental2 = new CarRental("Bob", "Honda Civic", 3, 40.0);

        rental1.displayRentalInfo();
        System.out.println();
        rental2.displayRentalInfo();
    }
}