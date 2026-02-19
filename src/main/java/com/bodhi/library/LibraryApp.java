package com.bodhi.library;

public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("=== University Library System ===\n");

        // 1. PATTERN: Factory Method Usage
        // Creating items without knowing concrete classes directly
        LibraryItem book = LibraryItemFactory.createLibraryItem("BOOK", "Design Patterns", "B001", 45.0,
                "Gamma et al.");
        LibraryItem journal = LibraryItemFactory.createLibraryItem("JOURNAL", "IEEE Software", "J001", 15.0, "2023");
        LibraryItem expensiveBook = LibraryItemFactory.createLibraryItem("BOOK", "Rare First Edition", "B002", 500.0,
                "Famous Author");

        // 2. PATTERN: Adapter Usage
        // Treating a legacy E-Book as a standard LibraryItem
        OldEBookSystem oldEBook = new OldEBookSystem("Digital Java Guide");
        LibraryItem eBookAdapter = new EBookAdapter("Digital Java Guide", "E001", 0.0, oldEBook);

        // Display Info (Polymorphism)
        System.out.println("--- Catalog ---");
        book.displayInfo();
        journal.displayInfo();
        eBookAdapter.displayInfo(); // Adapts the call
        System.out.println();

        // 3. PATTERN: Chain of Responsibility Usage
        // Setup the chain: SelfCheckout -> Librarian
        Approver selfCheckout = new SelfCheckout();
        Approver librarian = new Librarian();

        // PRINCIPLE: Open/Closed Principle (OCP)
        // We can extend the chain (e.g., add a Manager) without modifying SelfCheckout
        // or Librarian code.
        selfCheckout.setNext(librarian);

        System.out.println("--- Borrowing Process ---");

        // Scenario A: Standard Book
        System.out.println("\nRequesting: " + book.getTitle() + " ($" + book.getValue() + ")");
        selfCheckout.approveBorrow(book);

        // Scenario B: Expensive Book
        System.out.println("\nRequesting: " + expensiveBook.getTitle() + " ($" + expensiveBook.getValue() + ")");
        selfCheckout.approveBorrow(expensiveBook);

        // Scenario C: E-Book (Adapter)
        System.out.println("\nRequesting: " + eBookAdapter.getTitle());
        selfCheckout.approveBorrow(eBookAdapter);
    }
}
