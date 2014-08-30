package com.java.patterns.src.visitor;

public class RDManager implements Visitable {
    private String sales;
    private boolean visited;

    public RDManager(String sales) {
        this.sales = sales;
        visited = true;
    }

    @Override
    public void accept(SalesVisitor salesVisitor) {
        salesVisitor.visit(this);
    }

    @Override
    public boolean visited() {
        return visited;
    }

    public String getSales() {
        return sales;
    }
}
