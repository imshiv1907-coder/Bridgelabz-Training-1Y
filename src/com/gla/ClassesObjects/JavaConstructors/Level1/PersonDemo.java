package com.gla.JavaConstructors.Level1;
class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("-------------------");
    }
}
public class PersonDemo {  public static void main(String[] args) {

    // Create original person
    Person original = new Person("Alice", 25);
    System.out.println("Original Person:");
    original.displayDetails();

    // Create cloned person using copy constructor
    Person clone = new Person(original);
    System.out.println("Cloned Person:");
    clone.displayDetails();
}
}
