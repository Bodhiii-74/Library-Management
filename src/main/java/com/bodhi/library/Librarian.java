package com.bodhi.library;

public class Librarian extends Approver {
    @Override
    public void approveBorrow(LibraryItem item) {
        System.out.println("Librarian: Manually approved borrowing of valuable item '" + item.getTitle() + "'.");
    }
}
