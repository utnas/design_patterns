package com.training.patterns.src.visitor;

public class RDManager implements Visitable {
    private String sales;
    private boolean visited;

    public RDManager(final String sales) {
        this.sales = sales;
        visited = true;
    }

    @Override
    public void accept(final SalesVisitor salesVisitor) {
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
