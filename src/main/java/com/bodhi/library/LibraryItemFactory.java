package com.bodhi.library;

public class LibraryItemFactory {

    public static LibraryItem createLibraryItem(String type, String title, String id, double value, String extra) {
        if (type.equalsIgnoreCase("BOOK")) {
            return new Book(title, id, value, extra);
        } else if (type.equalsIgnoreCase("JOURNAL")) {
            return new Journal(title, id, value, Integer.parseInt(extra));
        } else {
            throw new IllegalArgumentException("Unknown item type: " + type);
        }
    }
}
