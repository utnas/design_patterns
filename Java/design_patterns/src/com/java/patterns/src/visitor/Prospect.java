package com.java.patterns.src.visitor;

public class Prospect implements Visitable {

    private String name;
    private boolean visited = false;

    public Prospect(final String name) {
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
