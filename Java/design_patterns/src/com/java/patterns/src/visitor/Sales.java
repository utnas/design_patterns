package com.java.patterns.src.visitor;

public interface Sales {
    public void visit(final Prospect prospect);

    public void visit(final Customer customer);

    public void visit(final RDManager prospect);

}
