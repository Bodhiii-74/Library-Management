package com.bodhi.library;

public class EBookAdapter extends LibraryItem {
    private OldEBookSystem ebookSystem;

    public EBookAdapter(String title, String id, double value, OldEBookSystem ebookSystem) {
        super(title, id, value);
        this.ebookSystem = ebookSystem;
    }

    @Override
    public void displayInfo() {
        System.out.print("E-Book [Adapter used]: ");
        ebookSystem.openDigitalFile();
    }

    @Override
    public void process() {
        displayInfo();
    }
}
