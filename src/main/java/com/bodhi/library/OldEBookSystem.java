package com.bodhi.library;

public class OldEBookSystem {
    private String digitalTitle;

    public OldEBookSystem(String digitalTitle) {
        this.digitalTitle = digitalTitle;
    }

    public void openDigitalFile() {
        System.out.println("Opening digital file for: " + digitalTitle + "...");
    }
}
