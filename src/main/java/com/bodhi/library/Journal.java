package com.bodhi.library;

// PATTERN: Factory Method (Concrete Product)
public class Journal extends LibraryItem {
    private int issueNumber;

    public Journal(String title, String id, double value, int issueNumber) {
        super(title, id, value); // PRINCIPLE: Inheritance
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() { // PRINCIPLE: Polymorphism
        System.out.println("Journal: " + title + " (Issue #" + issueNumber + ") [ID: " + id + ", Value: $" + value + "]");
    }
}
