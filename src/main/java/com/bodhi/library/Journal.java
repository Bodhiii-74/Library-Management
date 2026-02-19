package com.bodhi.library;

public class Journal extends LibraryItem {
    private int issueNumber;

    public Journal(String title, String id, double value, int issueNumber) {
        super(title, id, value);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out
                .println("Journal: " + title + " (Issue #" + issueNumber + ") [ID: " + id + ", Value: $" + value + "]");
    }
}
