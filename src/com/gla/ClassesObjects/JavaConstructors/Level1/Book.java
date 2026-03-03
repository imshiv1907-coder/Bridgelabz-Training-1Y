package com.gla.JavaConstructors.Level1;


public class Book {

    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Borrow book method
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author + ".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Return book method (optional)
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have successfully returned \"" + title + "\".");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 9.99, true);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99, false);

        book1.borrowBook(); // Should borrow successfully
        book2.borrowBook(); // Should say not available

        book1.returnBook(); // Return the book
        book1.borrowBook(); // Borrow again
    }
}