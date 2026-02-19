package com.bodhi.library;

// PATTERN: Factory Method (Concrete Product)
public class Book extends LibraryItem {
    private String author;

    public Book(String title, String id, double value, String author) {
        super(title, id, value); // PRINCIPLE: Inheritance
        this.author = author;
    }

    @Override
    public void displayInfo() { // PRINCIPLE: Polymorphism
        System.out.println("Book: " + title + " by " + author + " [ID: " + id + ", Value: $" + value + "]");
    }
}
