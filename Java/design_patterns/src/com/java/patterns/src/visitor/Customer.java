package com.java.patterns.src.visitor;

public class Customer implements Visitable {
    private boolean visited;

    @Override
    public void accept(SalesVisitor salesVisitor) {
        salesVisitor.visit(this);
        visited = true;
    }

    @Override
    public boolean visited() {
        return visited;
    }
}
