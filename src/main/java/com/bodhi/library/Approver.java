package com.bodhi.library;

public abstract class Approver {
    protected Approver nextApprover;

    public void setNext(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approveBorrow(LibraryItem item);
}
