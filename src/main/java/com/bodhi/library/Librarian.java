package com.bodhi.library;

// PATTERN: Chain of Responsibility (Concrete Handler)
public class Librarian extends Approver {
    @Override
    public void approveBorrow(LibraryItem item) {
        // Logic: Approves everything that reaches here
        System.out.println("Librarian: Manually approved borrowing of valuable item '" + item.getTitle() + "'.");
    }
}
