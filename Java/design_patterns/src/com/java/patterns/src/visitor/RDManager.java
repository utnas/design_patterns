package com.java.patterns.src.visitor;

public class RDManager implements Guest {
    private String sales;

    public RDManager(String sales) {
        this.sales = sales;
    }

    @Override
    public void accept(Sales sales) {
        sales.visit(this);
    }

    public String getSales() {
        return sales;
    }
}
