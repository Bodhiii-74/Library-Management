package com.bodhi.library;

// PATTERN: Adapter (Adaptee - Legacy Code)
public class OldEBookSystem {
    private String digitalTitle;

    public OldEBookSystem(String digitalTitle) {
        this.digitalTitle = digitalTitle;
    }

    public void openDigitalFile() {
        System.out.println("Opening digital file for: " + digitalTitle + "...");
    }
}
