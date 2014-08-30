package com.java.patterns.src.visitor;

public interface SalesVisitor {
    public void visit(final Prospect prospect);

    public void visit(final Customer customer);

    public void visit(final RDManager prospect);

}
