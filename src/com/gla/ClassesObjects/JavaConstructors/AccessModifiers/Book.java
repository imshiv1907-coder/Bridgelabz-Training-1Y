package com.gla.AccessModifiers;

public class Book {

        // Public member
        public String ISBN;

        // Protected member
        protected String title;

        // Private member
        private String author;

        // Constructor
        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        // Public method to get author
        public String getAuthor() {
            return author;
        }

        // Public method to set author
        public void setAuthor(String author) {
            this.author = author;
        }

        // Method to display book details
        public void displayBookDetails() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("------------------------");
        }


    // Subclass
    class Book extends Book {

        private double fileSize; // in MB

        // Constructor
        public EBook(String ISBN, String title, String author, double fileSize) {
            super(ISBN, title, author);
            this.fileSize = fileSize;
        }

        // Method to display eBook details
        public void displayEBookDetails() {
            // Accessing public and protected members from superclass
            System.out.println("E-Book ISBN: " + ISBN);        // Public
            System.out.println("E-Book Title: " + title);      // Protected
            System.out.println("Author: " + getAuthor());      // Private via getter
            System.out.println("File Size: " + fileSize + " MB");
            System.out.println("------------------------");
        }
    }

    // Main class to test
    class LibrarySystem {
        public static void main(String[] args) {
            // Regular book
            Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
            book1.displayBookDetails();

            // Change author
            book1.setAuthor("J. Bloch");
            System.out.println("After updating author:");
            book1.displayBookDetails();

            // EBook
            EBook ebook1 = new EBook("978-1492056270", "Learning Java", "Marc Loy", 5.6);
            ebook1.displayEBookDetails();
        }
    }
}
