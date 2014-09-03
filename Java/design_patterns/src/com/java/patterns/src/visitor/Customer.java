package com.java.patterns.src.visitor;

public class Customer implements Visitable {
    private final String name;
    private boolean visited;

    public Customer(final String name) {
        this.name = name;
    }

    @Override
    public void accept(final SalesVisitor salesVisitor) {
        salesVisitor.visit(this);
        visited = true;
    }

    @Override
    public boolean visited() {
        return visited;
    }

    public String getName() {
        return name;
    }
}
