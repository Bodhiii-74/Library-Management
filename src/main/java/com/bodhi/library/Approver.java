package com.bodhi.library;

// PATTERN: Chain of Responsibility (Handler)
// PRINCIPLE: Open/Closed Principle (OCP) - New approvers can be added to the chain without modifying existing Approver logic.
public abstract class Approver {
    protected Approver nextApprover;

    public void setNext(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approveBorrow(LibraryItem item);
}
