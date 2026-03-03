package com.gla.JavaConstructors.Level1;

// HotelBooking class
class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this("Unknown Guest", "Standard", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
        System.out.println("----------------------------");
    }
}

// Main class
public class HotelBookingDemo {
    public static void main(String[] args) {

        // Using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBooking();

        // Using parameterized constructor
        HotelBooking paramBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        paramBooking.displayBooking();

        // Using copy constructor
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        System.out.println("Copied Booking:");
        copyBooking.displayBooking();
    }
}