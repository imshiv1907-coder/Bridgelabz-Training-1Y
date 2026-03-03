package com.gla.InstanceAndClassVariable;

public class Vehicle {

        private String ownerName;
        private String vehicleType;

        // Class variable (shared by all vehicles)
        private static double registrationFee = 100.0; // Default fee

        // Constructor
        public Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        // Instance method to display vehicle details
        public void displayVehicleDetails() {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: $" + registrationFee);
            System.out.println("------------------------");
        }

        // Class method to update registration fee
        public static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to: $" + registrationFee);
        }

        // Main method to test
        public static void main(String[] args) {
            Vehicle vehicle1 = new Vehicle("Alice", "Car");
            Vehicle vehicle2 = new Vehicle("Bob", "Motorbike");

            // Display initial vehicle details
            vehicle1.displayVehicleDetails();
            vehicle2.displayVehicleDetails();

            // Update registration fee
            Vehicle.updateRegistrationFee(150.0);

            // Display vehicle details again to reflect updated fee
            vehicle1.displayVehicleDetails();
            vehicle2.displayVehicleDetails();
        }

}
