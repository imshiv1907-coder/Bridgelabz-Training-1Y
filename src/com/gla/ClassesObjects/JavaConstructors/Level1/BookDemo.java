package com.gla.JavaConstructors.Level1;
// Book class
class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : $" + price);
        System.out.println("----------------------");
    }
}
public class BookDemo { public static void main(String[] args) {

    // Using default constructor
    Book defaultBook = new Book();
    defaultBook.displayDetails();

    // Using parameterized constructor
    Book paramBook = new Book("The Alchemist", "Paulo Coelho", 15.99);
    paramBook.displayDetails();
}
}
