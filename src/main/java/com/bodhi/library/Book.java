package com.bodhi.library;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, String id, double value, String author) {
        super(title, id, value);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + " [ID: " + id + ", Value: $" + value + "]");
    }
}
