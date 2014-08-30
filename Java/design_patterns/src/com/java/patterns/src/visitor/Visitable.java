package com.java.patterns.src.visitor;

public interface Visitable {
    public void accept(final SalesVisitor salesVisitor);

    public boolean visited();
}
