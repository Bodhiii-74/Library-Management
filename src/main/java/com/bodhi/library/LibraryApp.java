package com.bodhi.library;

public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("=== University Library System ===\n");

        LibraryItem book = LibraryItemFactory.createLibraryItem("BOOK", "Design Patterns", "B001", 45.0,
                "Gamma et al.");
        LibraryItem journal = LibraryItemFactory.createLibraryItem("JOURNAL", "IEEE Software", "J001", 15.0, "2023");
        LibraryItem expensiveBook = LibraryItemFactory.createLibraryItem("BOOK", "Rare First Edition", "B002", 500.0,
                "Famous Author");

        OldEBookSystem oldEBook = new OldEBookSystem("Digital Java Guide");
        LibraryItem eBookAdapter = new EBookAdapter("Digital Java Guide", "E001", 0.0, oldEBook);
        System.out.println("--- Catalog ---");
        book.displayInfo();
        journal.displayInfo();
        eBookAdapter.displayInfo();
        System.out.println();

        Approver selfCheckout = new SelfCheckout();
        Approver librarian = new Librarian();

        selfCheckout.setNext(librarian);

        System.out.println("--- Borrowing Process ---");

        System.out.println("\nRequesting: " + book.getTitle() + " ($" + book.getValue() + ")");
        selfCheckout.approveBorrow(book);

        System.out.println("\nRequesting: " + expensiveBook.getTitle() + " ($" + expensiveBook.getValue() + ")");
        selfCheckout.approveBorrow(expensiveBook);

        System.out.println("\nRequesting: " + eBookAdapter.getTitle());
        selfCheckout.approveBorrow(eBookAdapter);
    }
}
