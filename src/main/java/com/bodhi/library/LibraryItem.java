package com.bodhi.library;

public abstract class LibraryItem implements ItemProcessor {
    protected String title;
    protected String id;
    protected double value;

    public LibraryItem(String title, String id, double value) {
        this.title = title;
        this.id = id;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public double getValue() {
        return value;
    }

    public abstract void displayInfo();

    @Override
    public void process() {
        displayInfo();
    }
}
