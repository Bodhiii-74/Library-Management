package com.bodhi.library;

public class SelfCheckout extends Approver {
    @Override
    public void approveBorrow(LibraryItem item) {
        if (item.getValue() < 50) {
            System.out.println("SelfCheckout: Approved borrowing of '" + item.getTitle() + "'.");
        } else if (nextApprover != null) {
            System.out.println("SelfCheckout: Item too valuable, passing to Librarian...");
            nextApprover.approveBorrow(item);
        } else {
            System.out.println("SelfCheckout: Cannot approve, and no further steps.");
        }
    }
}
