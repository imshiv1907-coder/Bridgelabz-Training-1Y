package com.gla.ObjectsAndClasses.Level2;

// MovieTicket class
class MovieTicket {

    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0.0;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name : " + movieName);
        if (isBooked) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : $" + price);
            System.out.println("Status     : Booked");
        } else {
            System.out.println("Status     : Not Booked");
        }
        System.out.println("----------------------------");
    }
}

// Main class
public class MovieBookingSystem {
    public static void main(String[] args) {

        // Create MovieTicket object
        MovieTicket ticket = new MovieTicket("Inception");

        // Display before booking
        ticket.displayTicketDetails();

        // Book the ticket
        ticket.bookTicket("A10", 12.50);

        // Display after booking
        ticket.displayTicketDetails();
    }
}